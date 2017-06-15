<html>
    <head>
        <title>Create Notice</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Covered+By+Your+Grace|Didact+Gothic|Oxygen" rel="stylesheet">
        <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
        <style type="text/css">
            <!-- @import url("css/profile.css");
            -->
        </style>
        <%@include file="pageLayout.jsp" %>
          <%@include file="preventbackbutton.jsp" %>
    </head>

    <body>
        <div class="container-fluid" id="pagecontent">
            <div class="row">
               <div class="col-sm-4"> 
            <div id="pimage">
                <span class="nb-brand"><span class="white">notice</span><span class="black">board</span></span>
                </div>
                <div ><br>
                    <div class="noticepublish">
                        <p>Notice Published:</p>
                        The No. of Notice Published till date is 1000.
                   
                    </div>        
                </div>
                   
                   </div>
                <div class="col-sm-6" id="sidecontent">
                    <h2><%=session.getAttribute("Name")%></h2>
                    <h5><%=session.getAttribute("designation")%></h5><br>
                    <h4><span><a id="aabout" href="#" onclick="about()" class="active"><span class="glyphicon glyphicon-user"></span>&nbsp;<span>About</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></span>|<a id="aprivacy" href=javascript:privacy() class="inactive">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-lock"></span>&nbsp;<span >Privacy</span></a></h4><hr>
                    <div class="conatine-fluid" id="about" >
                    <p>BASIC INFORMATION</p><br>
                    <div class="row">
                        <div class="col-sm-3">USER-ID</div>
                        <div class="col-sm-3"><%=session.getAttribute("uid")%></div>
                    </div><br>
                    <div class="row">
                        <div class="col-sm-3">USERNAME</div>
                        <div class="col-sm-3"><%=session.getAttribute("username")%></div>
                    </div><br>
                    <div class="row">
                        <div class="col-sm-3">DATE OF BIRTH</div>
                        <div class="col-sm-3"><%=session.getAttribute("dob")%></div>
                    </div><br>
                    <div class="row">
                        <div class="col-sm-3">GENDER</div>
                        <div class="col-sm-3"><%=session.getAttribute("gender")%></div>
                    </div><br>
                    <form action="editProfileServlet" method="get">
                    <p>CONTACT INFORMATION</p><br>
                     <div class="row">
                        <div class="col-sm-3">CONTACT NO.</div>
                        <div class="col-sm-3"><input type="text" name="contactno" value="<%=session.getAttribute("contactno")%>"></div>
                    </div><br>
                    <div class="row">
                        <div class="col-sm-3">E-Mail</div>
                        <div class="col-sm-3"><input type="email" value="<%=session.getAttribute("email")%>" name="email"></div>
                    </div><br>
                   
                        <div class="left"><input type="submit" value="update"></div>
                    </form>
                    <br>
                        
                    </div>
                    <div class="container-fluid" id="privacy"><br>
                    <p>SECURITY</p>
                    <form action="ProfileServlet" method="post" onsubmit="return passwordcheck();">
                    <div class="row">
                        <div class="col-sm-6">Current Password</div>
                        <div class="col-sm-6"><input type="password" name="currentpassword" id="currpswd"></div>
                    </div><br>
                    <div class="row">
                        <div class="col-sm-6">New Password</div>
                        <div class="col-sm-6"><input type="password" name="newpassword" id="nwpaswd"></div>
                    </div><br>
                    <div class="row">
                        <div class="col-sm-6">Confirm Password</div>
                        <div class="col-sm-6"><input type="password" name="confirmpassword" id="confrmpaswd"></div>
                    </div><br><br>
                    <div class="row">
                        <div class="col-sm-8"><input type="submit" value="save"></div>
                        <div class="col-sm-4"></div>
                    </div><br>
                   
                    </form>
                    </div>
                </div>
            </div>
        </div>
        <script src="viewnotice.js"></script>
    </body>
</html>