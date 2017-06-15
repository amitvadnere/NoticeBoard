<html>
   <head>
      <title>noticeboard</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link href="https://fonts.googleapis.com/css?family=Covered+By+Your+Grace|Didact+Gothic|Oxygen" rel="stylesheet">
      <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <link href="https://fonts.googleapis.com/css?family=Comfortaa" rel="stylesheet">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
      <link href="https://fonts.googleapis.com/css?family=Josefin+Sans" rel="stylesheet">
      <style type="text/css">
         <!--
            @import url("css/noticeboard1.css");
            -->
      </style>
   </head>
   <body>
      <div class="container-fluid" id="headbanner">
         <nav class="navbar-inverse">
            <div class="navbar-header">
               <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>                    
               </button>
               <a class="navbar-brand" href="index.html">
                  <h1><span class="white">notice</span><span class="black">board</span></h1>
               </a>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar">
               <ul class="nav navbar-nav">
                   <li >&nbsp&nbsp&nbsp&nbsp&nbsp</li>
                  <li ><a href="#holiday">Holiday Notice</a></li>
                  <li><a href="#event">Event Notice</a></li>
                  <li><a href="#curricular">Curricular Notice</a></li>
                  <li><a href="#exam">Exam Notice</a></li>
               </ul>
                <ul class="nav navbar-nav navbar-right">
                     <li><a href="student.html"><span class="glyphicon glyphicon-log-in"></span> Main Panel</a></li>
                </ul>
            
            </div>
         </nav>
         <div class="jumbotron" id="new">
            <div class="Jumbotron" id="description">
               <p>May 22</p>
               <p>Pre-University Test</p>
               <input type="submit" value="Know More">
               <br><br><br><br><br>
            </div>
         </div>
      </div>
      <br><br>
      <div class="container-fluid" id="subnotice">
         <div class="jumbotron" id="holiday">
            <span>HOLIDAY NOTICE</span>
            <div class="row" id="row-holiday">
            
            </div>
         </div>
         <div class="jumbotron" id="event">
            <span>EVENT NOTICE</span>
            <div class="row" id="row-event">
            </div>
         </div>
         <div class="jumbotron" id="curricular">
            <span>CURRICULAR NOTICE</span>
            <div class="row" id="row-curricular">
             </div>
         </div>
         <div class="jumbotron" id="exam">
            <span>EXAM NOTICES</span>
            <div class="row" id="row-exam">
            </div>
         </div>
      </div>
    <br><br>
       <div class="container-fluid" id="footer">
            
       </div>
       <script src="nb.js"></script>
       <script>
   
          var ncontent = JSON.parse(JSON.stringify(<%=session.getAttribute("getNotice")%>));
          createElement(ncontent);
    
        </script>
   </body>
</html>