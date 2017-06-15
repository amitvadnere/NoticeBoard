<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans" rel="stylesheet"> 
    <link href="https://fonts.googleapis.com/css?family=Covered+By+Your+Grace|Didact+Gothic|Oxygen" rel="stylesheet">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
    <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
      
    <style type="text/css">
            <!--
			     @import url("dashboard.css");
		      -->
    </style>
</head>
<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>                    
                </button>
                <a class="navbar-brand" href="index.html">noticeboard</a>
            </div>
<!--            javascript:document.submitForm.submit()-->
            <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav">
                    <li><a href="dashboard.jsp">Home</a></li>
                    <li><a href="createnotice.jsp">Create Notice</a></li>
<!--                    <li><a href="DeleteNotice.jsp">Update Notice</a></li><!wrong href given>-->
                    <li><a href="ViewNoticeServlet">View Notice</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="ProfileServlet"><span class="glyphicon glyphicon-user"></span>  <%=session.getAttribute("Name")%></a></li>
                    <li><a href="signout.jsp"><span class="glyphicon glyphicon-log-in"></span> Sign Out</a></li>
                </ul>
            </div>
        </div>
    </nav>
                    
           
            
    </body>
</html>
