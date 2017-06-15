<html>
    <head>
        <title>Create Notice</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <link href="https://fonts.googleapis.com/css?family=Covered+By+Your+Grace|Didact+Gothic|Oxygen" rel="stylesheet">
        <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
        
        <style type="text/css">
            <!--
			     @import url("css/createnotice.css");
		      -->
        </style>
        <%@include file="pageLayout.jsp" %>
        <%@include file="preventbackbutton.jsp" %>
        <script>
          function validate(){
            var title=document.getElementById("title").value;
            var date=document.getElementById("endate").value;
            //date=date.toLocaleDateString();
           // var dateobj=new Date();
       
           /* if(date < dateobj){
                document.getElementById("dalert").innerHTML = "*End Date must be greater than current Date";
                return false;
            }*/

            if(title.length<3){
                document.getElementById("talert").innerHTML = "*title cant be so small";
                return false;
                }
               
                
            }   
        </script>
    </head>
    <body>
             <div class="container-fluid" id="container">
            <div class="jumbotron" id="main-container">
                <div class="jumbotron" id="main-head"><h3>Create Notice</h3></div>
                <div class="jumbotron" id= "subcontainer">
                    <p>Step 1/3</p>
                    <form method="get" action="crnServlet1" onsubmit="return validate();">
                        <div class="row">
                            <div class="col-sm-6" id="div1">
                                <div class="jumbotron" >
                                    <p id="talert" style="color: red;font-size: 16"></p>
                                    <table class="table">
                                        <tr>
                                            <td>Notice Title</td>
                                            <td><input type="text" name=title placeholder="Notice Title" id="title"></td>
                                             
                                        </tr>
                                        <tr>
                                            <td>Priority</td>
                                            <td><select name="priority">
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>
                                        </select></td>
                                        </tr>
                                        <tr>
                                                                                                                                                                                                             
                                            <td>Notice Visibility</td>
                                            <td><select name="visibility">
                                            <option value="1">1st Year</option>
                                            <option value="2">2nd Year</option>
                                            <option value="3">3rd Year</option>
                                            <option value="4">4th Year</option>
                                            <option value="5">All</option>
                                        </select></td>
                                        </tr>
                                        <tr>
                                            <td>Notice Type</td>
                                            <td><select name="NoticeType">
                                            <option value="Exams">Exams</option>
                                            <option value="Events">Event</option>
                                            <option value="Curricular">Curricular</option>
                                            <option value="Holiday">Holiday</option>
                                        </select></td>
                                        </tr>    
                                    </table>    
                                </div>
                            </div>    
                            <div class="col-sm-6">
                                <div class="jumbotron">
                                    <p id="dalert" style="color: red;font-size: 16"></p>
                                    <table class="table table-borderless">
                                        <tr>
                                            <td>Input Type</td>
                                            <td><select name="InputType">
                                            <option value="Manual-Entry">Manual-Entry</option>
                                            <option value="PhotoNotice">Photo-Notice</option>
                                        </select></td>
                                        </tr>

                                        <tr>
                                            <td>End-Date</td>
                                            <td><input type="date"  name="EndDate" id="endate"></td>
                                        </tr>
                                       
                                    </table>
                                   
                                </div>
                                <input class="btn pull-right" id="next" type="submit" value="Next">
                            </div>
                        </div>   
                         
                    </form>
                   
                </div>
            </div>
        </div>
    </body>
</html>