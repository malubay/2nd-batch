/**
 * Created by JPMPC-B213 on 1/11/2017.
 */
$(".has-error").hide();
$("#submitBtn").click(function (e) {
    e.preventDefault();

    $.ajax({
        method: 'post',
        url: '/create',
        data: $("#regForm").serialize(),
        dataType: 'json',
        success: function (data) {
            /* $("#regForm").fadeOut();
             $("#form-style-2").append("Name:" +response.fullname+",<br>"+"Email: " + response.email+",<br>"+"Mobile Number:" + response.tel_no);*/

            if (data.message) {
                $("#regForm").slideUp('slow');
                $("#form-style-2").hide().fadeIn().html('<p class="text-center" >You are successfully registered.</p>');
            } else {
               /* $(".has-error").removeClass("has-error");
                $.each(data.errors, function (a, b) {
                    $( "#"+ b ).hide().fadeIn().addClass("has-error");
                });
*/
                $("#formMessage").empty();

                $(".has-error").fadeOut().empty();
                $(".error").remove();
                $.each(data, function (a, b) {
                        //$("#formMessage").append("<div>"+b+"</div>");
                        //$("#"+a+"Div").hide().fadeIn().addClass("has-error");
                        //$("#"+a).next().remove();
                        //$("#"+a).after("<p class='alert-danger error'>"+b+"</p>");
                        $("#"+a).after("<p class='error'>"+b+"</p>");
                        $(".has-error").fadeIn();

                });
                $()
            }
        }
    })
});
           /* error: function(){
                alert("Thanks");*/



/*
    thankyou(HttpServletResponse resp)
    try{
    Writer writer = resp.getWriter();

    if(!bindingResults.hasErrors){
        save here/return dat
    } else {
        parse bindingResults into object
    }
    catch(Exception ex){

    }
*/

