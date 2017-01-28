/**
 * Created by JPMPC-B213 on 12/2/2016.
 */

var i = 0;
function appendDiv() {
        i++;
    {


        /*  self.postMessage('<div id="conversation">'+ i +' User conversations says: ' + i + '</div>');*/
        self.postMessage('<div id="conversation">User conversations says: ' + i + '</div>');

    }

    setTimeout("appendDiv()",1000);
}

appendDiv();




z

/*var i = 0;

function timedCount() {
    i = i + 1;
    postMessage(i);
    setTimeout("timedCount()",500);
}

timedCount();*/