<%@page import="java.util.ArrayList"%>
<html>
<head>
    <title>dashboard</title>
    <link href="https://fonts.googleapis.com/css?family=Josefin+Sans" rel="stylesheet"> 
    <link href="https://fonts.googleapis.com/css?family=Covered+By+Your+Grace|Didact+Gothic|Oxygen" rel="stylesheet">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
    <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
    <script src="Chart.js"></script>        

    <style type="text/css">
            <!--
			     @import url("css/dashboard.css");
		      -->
    </style>
    <%@include file="pageLayout.jsp" %>
    <%@include file="preventbackbutton.jsp" %>
</head>
<body>
    
    <div class="conatiner-fluid" id="mainbody">
        <div class="jumbotron" >
            <div class="rows" id="maincontent">
                <div class="col-sm-8">
                    <div class="jumbotron" id="maingraph">   
                        <canvas id="myChart" height="100px"></canvas>
                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="jumbotron" id="noticetoggle" data-spy="scroll" data-target="#myScrollspy" data-offset="2">
                        <h3 >Active Notice</h3><br>
                        <div class="innercontent">
                            <table class="table">
                                <tbody>
                                    <tr>
                                        <td>Holiday Notice Regarding Ganesh Panchmi</td>
                                        <td><input type="checkbox" checked data-toggle="toggle"></td>
                                    </tr>
                                    <tr>
                                        <td>Mid-Sem Time Table</td>
                                        <td><input type="checkbox" checked data-toggle="toggle"></td>
                                    </tr>
                                    <tr>
                                        <td>Moonstone 2K17 OFFICIAL NOTICE</td>
                                        <td><input type="checkbox" checked data-toggle="toggle"></td>
                                    </tr>
                                    <tr>
                                        <td>Holiday Notice Regarding Ganesh Panchmi</td>
                                        <td><input type="checkbox" checked data-toggle="toggle"></td>
                                    </tr>
                                    <tr>
                                        <td>Holiday Notice Regarding Ganesh Panchmi</td>
                                        <td><input type="checkbox" checked data-toggle="toggle"></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div><br>
            <div class="rows" id="maincontent">
                <div class="col-sm-4">
                    <div class="jumbotron">
                        <div id="day"></div>
                        <div id="monthyear">
                            <span id="month"></span> <span id="year"></span>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="jumbotron" >
                         <canvas id="myChart3" height="200%"></canvas>                    
                    </div> 
                </div>
                <div class="col-sm-4">
                    <div class="jumbotron">
                        <h3>All Notices</h3><br>
                        <div class="innercontent">
                            <table class="table">
                                <tbody >
                                    <tr>
                                        <td>Holiday Notice Regarding Ganesh Panchmi</td>
                                    </tr>
                                    <tr>
                                        <td>Mid-Sem Time Table</td>
                                    </tr>
                                    <tr>
                                        <td>Moonstone 2K17 OFFICIAL NOTICE</td>
                                    </tr>
                                    <tr>
                                        <td>Holiday Notice Regarding Ganesh Panchmi</td>
                                    </tr>
                                    <tr>
                                        <td>Holiday Notice Regarding Ganesh Panchmi</td>
                                    </tr>
                                    <tr>
                                        <td>Mid-Sem Time Table</td>
                                    </tr>
                                    <tr>
                                        <td>Mid-Sem Time Table</td>
                                    </tr>
                                    <tr>
                                        <td>Mid-Sem Time Table</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>  
    </div>
     <form name="submitForm" method="GET" action="ViewNoticeServlet">
                     <input type="hidden" name="uid" value="<%=session.getAttribute("uid")%>">
                </form>       
    <script src="dashboard.js"></script>
</body>
</html>