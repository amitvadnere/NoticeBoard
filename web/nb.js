var color=["rgba(75,192,192,1)","rgba(65,125,192,1)","orange","rgba(85,135,152,1)","rgba(85,155,160,1)","rgba(75,110,152,1)"];
 var y = Math.floor(Math.floor((Math.random() * 10) + 1)/2);
function getDate(date){
    var monthNames = ["January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December"
    ];

    var dateno=date.substring(8,10);
    
    var month=date.substring(5,7);
    var monthno=parseInt(month)-1; 
    var m = monthNames[monthno];
    var datestring=dateno+" "+m;
    return datestring;
}

function createElement(){
    var noticeContent = ncontent;
    var nTitle=noticeContent[0];
    var nDate=noticeContent[1];
    var row=noticeContent[2];
    var nType=noticeContent[3];
    var nId=noticeContent[4];
    document.getElementById("row-holiday").style.backgroundColor=color[y];
    document.getElementById("row-exam").style.backgroundColor=color[y];
    document.getElementById("row-event").style.backgroundColor=color[y];
    document.getElementById("row-curricular").style.backgroundColor=color[y];
    for( var i=0;i<row;i++){ 
        
        if(nType[i]==="Holiday"){
            var x = Math.floor(Math.floor((Math.random() * 10) + 1)/2);
            document.getElementById("row-holiday").style.borderColor=color[y];
            var div = document.createElement("div"); 
            div.className="col-xs-4";
            div.style.backgroundColor=color[x];
            div.innerHTML='<a href="DSNServlet?nid='+nId[i]+'"><div class="jumbotron" id="date">'+getDate(nDate[i])+'</div><div class="jumbotron" id="title">'+nTitle[i]+'</div></a>';
            document.getElementById("row-holiday").appendChild(div);
        }    
            
        else if(nType[i]==="Exams"){    
            var x = Math.floor(Math.floor((Math.random() * 10) + 1)/2);
            var div = document.createElement("div"); 
            div.className="col-xs-4";
            div.style.backgroundColor=color[x];
            div.innerHTML='<a href="DSNServlet?nid='+nId[i]+'"><div class="jumbotron" id="date">'+getDate(nDate[i])+'</div><div class="jumbotron" id="title">'+nTitle[i]+'</div></a>';
            document.getElementById("row-exam").style.borderColor=color[y];
            document.getElementById("row-exam").appendChild(div);
        }    

        else if(nType[i]==="Event"){ 
            var x = Math.floor(Math.floor((Math.random() * 10) + 1)/2);
            var div = document.createElement("div"); 
            div.className="col-xs-4";
            div.style.backgroundColor=color[x];
            div.innerHTML='<a href="DSNServlet?nid='+nId[i]+'"><div class="jumbotron" id="date">'+getDate(nDate[i])+'</div><div class="jumbotron" id="title">'+nTitle[i]+'</div></a>';
            document.getElementById("row-event").style.borderColor=color[y];
            document.getElementById("row-event").appendChild(div);
        }
        else if(nType[i]==="Curricular"){
            var x = Math.floor(Math.floor((Math.random() * 10) + 1)/2);
            var div = document.createElement("div"); 
            div.className="col-xs-4";
            div.style.backgroundColor=color[x];
            div.innerHTML='<a href="DSNServlet?nid='+nId[i]+'"><div class="jumbotron" id="date">'+getDate(nDate[i])+'</div><div class="jumbotron" id="title">'+nTitle[i]+'</div></a>';
            document.getElementById("row-curricular").style.borderColor=color[y];
            document.getElementById("row-curricular").appendChild(div);
        }    
    }
}