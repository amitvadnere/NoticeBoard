<html>



    <head>
        <title>Create Notice</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://fonts.googleapis.com/css?family=Covered+By+Your+Grace|Didact+Gothic|Oxygen" rel="stylesheet">
        <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
        <style type="text/css">
            <!-- @import url("css/viewnotice1.css");
            -->
        </style>
        <%@include file="pageLayout.jsp" %>
          <%@include file="preventbackbutton.jsp" %>
    </head>

    <body>
       
        <div class="container-fluid" id="filter-container">
            <div class="jumotron" id="filter">
                <input type="button" value="FILTERS" onclick="filter()">
            </div>
        </div>

        <div class="container-fluid">

            <div class="jumbotron" id="holiday">
                <h4>HOLIDAY</h4>
                <hr>
                
            </div>
            <div class="jumbotron" id="events">
                <h4>EVENTS</h4>
                <hr>
                
            </div>`
            <div class="jumbotron" id="curricular">
                <h4>CURRICULAR</h4>
                <hr>
            </div>  
            <div class="jumbotron" id="exams">
                <h4>EXAMS</h4>
                <hr>
                
        </div>
            <br>
            <br>
        <form name="submitForm" method="GET" action="DisplayNoticeServlet">
                     <input type="hidden" name="nid" id="nidinput" value="false">
        </form>     
        <div class="container-fluid" id="filter-pop">
            <div class="jumbotron" id="popupbox">
                <h4>FILTER</h4>
                <hr align="left">
                <form action="FilterNoticeServlet" method="get" >
                    <span>Type</span>
                    <span> 
                            <select id = 'opt' name = 'filter_opt' onclick ="fnselection()">
                                <option value="select">select</option>
                                <option value="month">month wise</option>
                                <option value="year">year wise</option>
                            </select>
                    </span>
                    <br>
                    <br>
                    <div id="t1"><span>Month</span>
                    <span>
                        <select name='m' >
                            <option disabled selected>-Select Month-</option>
                            <option value="01">January</option>
                            <option value="02">February</option>
                            <option value="03">March</option>
                            <option value="04">April</option>
                            <option value="05">May</option>
                            <option value="06">June</option>
                            <option value="07">July</option>
                            <option value="08">August</option>
                            <option value="09">September</option>
                            <option value="10">October</option>
                            <option value="11">November</option>
                            <option value="12">December</option>
                        </select>
                        </span>
                    </div>
                    <br>
                    <br>
                    <div id="t2">
                        <span>Year</span><span>  
                            <select name='y' >
                                <option disabled selected>-Select year-</option>
                                <option value="2017">2017</option>
                                <option value="2018">2018</option>
                                <option value="2019">2019</option>
                                <option value="2020">2020</option>
                                <option value="2021">2021</option>
                                <option value="2022">2022</option>
                                <option value="2023">2023</option>
                                <option value="2024">2024</option>  
                                <option value="2025">2025</option>
                                <option value="2026">2026</option>
                                <option value="2027">2027</option>  
                            </select>
                        </span>
                    </div>
                    <br>
                    <br>
                    <input type="submit" value="Filter">
                </form>
            </div>
        </div>
        </div>
<script src="viewnotice.js"></script>
<script>
   
    var ncontent = JSON.parse(JSON.stringify(<%=session.getAttribute("getNoticeContent")%>));
    createElement(ncontent);
    
    </script>
        
    </body>
</html>