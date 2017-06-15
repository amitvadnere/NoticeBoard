
<%@page import="dto.NoticeData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>default template</title>
        <style type="text/css">
            <!--
			     @import url("css/t1.css");
		      -->
        </style>
    </head>
    
    <body>
        
       
        
        <h1 align="center">NOTICE</h1>
         <img src="css/img/medilogo.png" alt="medi logo" height="130" width="150" id="medilogo"/>
        <%
            session=request.getSession();
            NoticeData nd=(NoticeData)session.getAttribute("NoticeData");
        %>
        <div id="mainbodybox">
            <div id="mainbodycontent">
                <p><%=nd.noticecontent%></p>
        </div>
        </div>
        <a href="tselector.jsp"><input type="button" value="back" class="button"></a>
        <a href="publishNoticeServlet"><input type="button" value="publish" class="button"></a>
    </body>
</html>
