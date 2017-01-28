/**
 * Created by JPMPC-B213 on 11/24/2016.
 */




/*STORAGE*/
$("#submitBtn").click(function (e){
        e.preventDefault();

    var name    = $("#name-field").val();
    var email   = $("#email-field").val();
    var number  = $("#number-field").val();
    if (click == true) /* REPLACE LATER*/
    localStorage.setItem("name", "name");
    localStorage.setItem("email", "email");
    localStorage.setItem("number", "number");
    $(this).hide();

    }
);











/*JS SCRIPT*/
$(document).on("click","#demo",function(event) {
    event.preventDefault();
});


$.ajax({
    method: 'GET',
    url   : 'ajax_info.json',
    dataType: "json",
    error: function(a,b,c){
        console.log(a);
    },
    success: function(data){
        /* $.each(data.employees, function(i,emp){
         $("#result").append("<div>"+emp.firstName+", "+emp.lastName+"</div>");
         });*/

        /* for(var i = 0; i < data.employees.length; i++) {
         //console.log(data.status[i].username);
         $("#result").append("<div>"+data.employees[i].firstName+", "+data.employees[i].lastName+"</div>");
         }*/

        $.each(data.data, function(i,field){
            $("#demo").append("<div id="+field.id+" class=\"fb-feeds\">"+
                "<div class=\"from\">"+field.from.name+"<span class='f-right medium-text'><a data-id="+field.id+" id='removeDiv' href='#' title='Remove this'>X Remove</a></span></div>"+
                "<div class=\"message\">"+field.message+"</div>"+
                "<div class=\"actions\">"+
                "<ul>"+
                "<li><a href="+field.actions[1].link+">"+field.actions[1].name+"</a></li>"+
                "<li>|</li>"+
                "<li><a href="+field.actions[0].link+">"+field.actions[0].name+"</a></li>"+
                "</ul>"+
                "<div>"+
                "</div>");
        });
    }
});

$(document).on("click","#removeDiv",function(event){
    event.preventDefault();

    var unique_id = $(this).attr("data-id");

    $("#"+unique_id).fadeOut();
});

/*$("body").fadeOut();*/
/*$("#playB").click(function() {
    alert("You click me");
});*/

/* $("#click-btn").click(function () {
   var $divClick = $("div");
    $divClick.css({background: 'blue'});
   findDivs();
});

setInterval(function () {
    findDivs();
},1000);

function findDivs() {
    var $divs = $("div");

    for (var i = 0; i <= $divs.length;i++){
        var colors = Array("pink","yellow","red","black");
        var shuffleColors = Math.floor(Math.random()*4);
        $divs[i].style.backgroundColor = colors [shuffleColors];
    }}

*/




 /*$.ajax({
    method: "GET",
    url: "ajax_info.txt",
    error: function () {

    },
    success:function(respone) {
        $("#demo").html(respone);
    }



})
*/







/*

$(document).on("click",".actions a",function (e) {
    e.preventDefault();
})


$("#demo-btn").click(function(){
    $.ajax({

        method:'GET',
        url:'ajax_info.json',
        dataType:'json',
        error:function(a,b,c){
            console.log(a);
        },
        success:function(data){

            $.each(data.data, function (i, field) {
                $("#result").append("<div class=\"fb-feeds\">" +
                    "<div class=\"from\">"+ field.from.name+"<span class='f-right medium-text'>" +
                    "Posted on = "+field.created_time+"</span>"+" </div>" +
                    "<div class=''

            })
        }

*/


























            /* result = "";
            $.each(response.data,function(a,b){
                result += "<div class='boxResult'><div class=\"boxResIn\"><span class='label'>ID:</span>"
                    +b.id+"<br/><span class='label'>FROM:</span> "+
                    b.from.name+
                    b.id+
                    "<br/><span class='label'>MESSAGE</span>: "+b.message+
                    "<br/><span class='label'>ACTIONS:</span> "+
                    " "+ b.actions[0].name+
                    " "+ b.actions[1].link+
                    "<br/><span class='label'>TYPE:</span> "+b.type+
                    "<br/><span class='label'>CREATED TIME:</span> "+ b.created_time+
                    "<br/><span class='label'>UPDATED TIME:</span> "+b.updated_time


                    +"</div></div><br/>";
            });
            $('#demo1 p').html(result);
        }
    });
});







 /*  $("#demo-btn").click(function () {
    $.ajax({
        method: 'GET',
        url: 'ajax_info.json',
        error: function (a, b, c) {
            console.log(c);
        },
        /* success: function (response)
         // $("#demo").html(response);
         console.log(response);*/
        /*success: function (data) {
            $.each(data.employees, function (i, field) {
                /!* for (var x = 0; x < data.employees.length;x++){
                 $("#demo").append("<br>" + data.employees[x].firstName + " " + data.employees[x].lastName)
                 }*!/
                $("#demo").append("<br>" + i + " " + field.firstName + " " + field.lastName + "<br>");
                //alert(i);

            });

        }


    });

});
*/
















/*
var n=5;
var x=1;x
var sum = n+x;
//alert(n+x);

document.getElementById("result").innerHTML = "The result is " + sum;*/
/*

var mySubmitBtn = document.getElementById("submitBtn");


mySubmitBtn.onclick = function(event){
    event.preventDefault();
    mySubmitBtn.style.display = "none";
}

/!*var myAudio = document.getElementById("myTune");
var myVideo = document.getElementById("myVideo");
var playPause = document.getElementById("play_pause");*!/

function mediaControl(task) {
    if(task == "play_pause"){
        if (myVideo.paused) {
            myVideo.play();
            playPause.innerText = 'PAUSE';
        } else {
            myVideo.pause();
            playPause.innerText = 'PLAY';
        }
    }
    if (task == "stop"){
        playPause.innerText = 'PLAY';

        myVideo.currentTime = 0;
        myVideo.pause();
    }
}

*/
