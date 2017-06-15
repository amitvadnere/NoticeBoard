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
                    <p>Step 2/3</p>
                    <form method="post" action="CrnServlet2" enctype="multipart/form-data">
                        <div class="row">
                            <div class="col-sm-12" id="mnupload">
                                <div class="jumbotron" id="noticeboxcontainer">
                                    <div id="noticeboxhead">Write Notice</div>
                                    <div><textarea id="noticetextbox" name="noticem" placeholder="Enter notice here"></textarea></div>
                                </div>
                                 <input class="btn pull-right" id="nextcr" type="submit" value="Next">
                            </div>
                          
                            <div class="col-sm-12" id="pnupload">
                                <div class="jumbotron" id="nuploadp">
                                    <div id="noticefilehead">Upload Notice</div>
                                    <div><input id="noticefile" type="file" name="phototnotice"></div>
                                </div><br><br><br><br><br><br><br><br>
                                <input class="btn pull-right" id="nextcr" type="submit" value="Next">
                            </div>
                        </div>   
                    </form>                   
                </div>
            </div>
        </div>
        <script src="viewnotice.js"></script>
        <script>
            var inputtype="<%=session.getAttribute("inputtype")%>";
            checkinput(inputtype);
        </script>
            
        
    </body>
</html>