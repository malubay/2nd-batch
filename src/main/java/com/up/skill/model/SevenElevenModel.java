package com.up.skill.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

/**
 * Created by JPMPC-B213 on 1/7/2017.
 */
@Entity
public class SevenElevenModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Please enter your full name!")
    private String fullname;


    @NotBlank(message = "Not blank")
    @Email(message = "Please enter a valid email!")
    private String email;


    @NotBlank(message = "Please enter valid tel_no!")
    @Pattern(regexp = "(^$|[0-9]{11})")
    private String tel_no;

    public SevenElevenModel(){

    }

    public SevenElevenModel(long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }
}

