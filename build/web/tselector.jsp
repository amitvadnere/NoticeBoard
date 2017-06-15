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
    </head>
    <body>
        
        <div class="container-fluid" id="container">
            <div class="jumbotron" id="main-container">
                <div class="jumbotron" id="main-head"><h3>Create Notice</h3></div>
                <div class="jumbotron" id= "subcontainer">
                    <p>Step 3/3</p>
                    <form action="publishNoticeServlet" method="get">
                        <div><b>Select Template</b></div>
                        <div class="row">    
                            <div class="col-sm-4" id="template">
                                <a href="defaultTemplate.jsp"><div class="jumbotron" id="imagetron">
                                    <p>No Image Available</p>
                                    </div></a>
                                <div>Default Template</div><br>
                                <input type="hidden" name="templatetype" value="default">
                                <input class="publishn"  type=submit value="Publish">
                            </div>
                            <div class="col-sm-4" id="template">
                                <div class="jumbotron" id="imagetron">
                                    <p>No Image Available</p>
                                </div>
                                <div>Gold Template</div><br>
                                <input class="publishn" type=submit value="Publish">
                            </div>
                            <div class="col-sm-4" id="template">
                                <div class="jumbotron" id="imagetron">
                                    <p>No Image Available</p>
                                </div>
                                <div>Platinum Template</div><br>
                                <input class="publishn" type=submit value="Publish">
                            </div>
                        </div>   
                    </form>                   
                </div>
            </div>
        </div>
    </body>
</html>