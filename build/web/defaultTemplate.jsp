<html>
    <head>
        <title>Notice Preview</title>
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
			     @import url("css/templatestyle.css");
		  -->
        </style>
    </head>
    <body>
         <div class="maindiv">
             <div class="innerdiv">
                <h1 class="mainhead">Medicaps University</h1>
                <h2 class="notice">Notice : <%=session.getAttribute("title")%></h2>
                <div class="noticeid"><b>NID</b> :<%=session.getAttribute("nid")%></div>
                <div id="date"></div>
                
                <p class="noticebody">
                     <%=session.getAttribute("ncontent")%>
                </p>
            </div>
          </div>
        <a href="tselector.jsp"><input type="button" value="Back"></a>
         <script src="currentdate.js"></script>
    </body>
</html>
