<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            HttpSession sn=request.getSession(false);
            session.removeAttribute("uid");
            session.removeAttribute("uname");        
            session.removeAttribute("NoticeData");
            session.invalidate();
            response.sendRedirect("index.html");
        %>
    </body>
</html>
