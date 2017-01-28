package com.up.skill.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.util.JSON;
import com.up.skill.model.SevenElevenRepository;
import com.up.skill.model.SevenElevenModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Controller
public class SevenElevenController {

    private SevenElevenRepository sevenElevenRepository;

    @Autowired
    public SevenElevenController(SevenElevenRepository sevenElevenRepository){
        this.sevenElevenRepository = sevenElevenRepository;
    }


    @RequestMapping(value = "/data/{id}")
    public String data(@PathVariable Long id, Model model){
        model.addAttribute("dataList",sevenElevenRepository.findOne(id));

        return "seveneleven/userInfo";
    }


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String loadRegistrationPage(){
        return "seveneleven/register";
    }


    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String loadData(Map<String,Object> model){
        List<SevenElevenModel> data = sevenElevenRepository.findAll();
        model.put("dataList" , data);
        return "seveneleven/data";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void getRespInJson(@Valid @ModelAttribute SevenElevenModel sevenElevenModel,
                              Errors errors,
                              BindingResult bindingResult ,
                              HttpServletResponse response ,
                              RedirectAttributes ra) {

        try {
            PrintWriter out = response.getWriter();

            JSONObject obj = new JSONObject();
            JSONArray list = new JSONArray();
            JSONArray msg = new JSONArray();

            if (!errors.hasErrors()) {
                obj.put("message", "success");

            } else {
                List<FieldError> errs = bindingResult.getFieldErrors();

                for (FieldError error : errs) {
                   /* list.add(error.getField());
                    msg.add(error.getDefaultMessage());
                    obj.put("errorMessages",msg);
                    obj.put("errors", list);*/

                   obj.put(error.getField() , error.getDefaultMessage());
                }
            }

            out.print(obj);
            sevenElevenRepository.save(sevenElevenModel);
        } catch (Exception ex){
            ex.toString();
        }
    }





  /*  <String, Object> map = new JSON
			map.put("name", "mkyong");*/



    @RequestMapping(value = "/post" , method = {RequestMethod.POST,RequestMethod.GET})
    public @ResponseBody SevenElevenModel loadThankYou(@ModelAttribute @Valid SevenElevenModel sevenElevenModel,
                       BindingResult bindingResult ,
                       ModelAndView model,
                       WebRequest request,
                       HttpServletResponse response
                                             ){

        if(!bindingResult.hasErrors()) {
            sevenElevenRepository.save(sevenElevenModel);
        }
        return sevenElevenModel;
    }


}

