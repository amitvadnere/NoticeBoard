   

function filter(){
    var div = document.getElementById("filter-pop");
    div.style.display ="block";
};
function fnselection(){
        if ($('#opt').val() == 'month'){
            $('#t1').show();
            $('#t2').hide();
        } else if($('#opt').val() == 'year'){
            $('#t2').show();
            $('#t1').hide();
        }
        else{
            $('#t1').hide();
            $('#t2').hide();
        }
};

function createElement(ncontent){
    var noticeContent = ncontent;
    var nTitle=noticeContent[0];
    var nDate=noticeContent[1];
    var row=noticeContent[2];
    var nType=noticeContent[3];
    var nId=noticeContent[4];
    
 for( var i=0;i<row;i++){ 
    if(nType[i]==="Holiday"){
        var div = document.createElement("div"); 
        div.className="jumbotron";
        div.id=nId[i];
        div.innerHTML='<a href=javascript:document.getElementById("nidinput").value="'+ nId[i] +'";document.submitForm.submit()><div class="row"><div class="col-sm-3">'+nId[i]+'</div><div class="col-sm-6">'+nTitle[i]+'</div><div class="col-sm-3">'+nDate[i]+'</div></div></a>';
        //div.innerHTML='<a href=javascript:document.submitForm.value="'+nId[i]+'";document.submitForm.submit()><div class="row"><div class="col-sm-3">'+nId[i]+'</div><div class="col-sm-6">'+nTitle[i]+'</div><div class="col-sm-3">'+nDate[i]+'</div></div></a>';
    document.getElementById("holiday").appendChild(div);
    }
     else if(nType[i]==="Event"){
        var div = document.createElement("div"); 
        div.className="jumbotron";
     div.innerHTML='<a href=javascript:document.getElementById("nidinput").value="'+ nId[i] +'";document.submitForm.submit()><div class="row"><div class="col-sm-3">'+nId[i]+'</div><div class="col-sm-6">'+nTitle[i]+'</div><div class="col-sm-3">'+nDate[i]+'</div></div></a>';
    document.getElementById("events").appendChild(div);
    }     
     else if(nType[i]==="Curricular"){ 
        var div = document.createElement("div"); 
        div.className="jumbotron";
      div.innerHTML='<a href=javascript:document.getElementById("nidinput").value="'+ nId[i] +'";document.submitForm.submit()><div class="row"><div class="col-sm-3">'+nId[i]+'</div><div class="col-sm-6">'+nTitle[i]+'</div><div class="col-sm-3">'+nDate[i]+'</div></div></a>';
    document.getElementById("curricular").appendChild(div);
    }
    else if(nType[i]==="Exams"){
        var div = document.createElement("div"); 
        div.className="jumbotron";
       div.innerHTML='<a href=javascript:document.getElementById("nidinput").value="'+ nId[i] +'";document.submitForm.submit()><div class="row"><div class="col-sm-3">'+nId[i]+'</div><div class="col-sm-6">'+nTitle[i]+'</div><div class="col-sm-3">'+nDate[i]+'</div></div></a>';
        document.getElementById("exams").appendChild(div);
    }     
  }
};
function privacy(){
    var div=document.getElementById("privacy");
    var div1=document.getElementById("about");
    var div2=document.getElementById("aprivacy");
    var div3=document.getElementById("aabout");
    div.style.display="block";
    div1.style.display="none";
    div2.className="active";
    div3.className="inactive";
}
function about(){
    var div1=document.getElementById("privacy");
    var div=document.getElementById("about");
    var div3=document.getElementById("aprivacy");
    var div2=document.getElementById("aabout");
    div.style.display="block";
    div1.style.display="none";
    div2.className="active";
    div3.className="inactive";
}
function checkinput(inputtype){
    var input=inputtype;
    
    if(input==="Manual-Entry"){
        var div=document.getElementById("mnupload");
        div.style.display="block";
        var div1=document.getElementById("pnupload");
        div1.style.display="none";
    }
    else if(input==="PhotoNotice"){
        var div=document.getElementById("pnupload");
        div.style.display="block";
        var div1=document.getElementById("mnupload");
        div1.style.display="none";
    }
}
 function passwordcheck(){

     var nwpaswd=document.getElementById("nwpaswd").value;
     var currpaswd=document.getElementById("confrmpaswd").value;
     if(nwpaswd===currpaswd){
         return true;
     }
     else{
         return false;
     }
  
 }         