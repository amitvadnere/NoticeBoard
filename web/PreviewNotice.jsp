
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
        <script type="text/javascript">
             $("#btnPrint").live("click", function () {
                var divContents = $("#dvContainer").html();
                var printWindow = window.open('', '', 'height=600,width=800');
                printWindow.document.write('<html><head><title>DIV Contents</title>');
                printWindow.document.write('</head><body>');
                printWindow.document.write(divContents);
                printWindow.document.write('</body></html>');
                printWindow.document.close();
                printWindow.print();
            });
    </script>
        <title>Preview Notice</title>
    </head>
    <body>
        <div  style="height:800px; " id="dvContainer">
            <h3>Subject: <%=session.getAttribute("nsubject") %></h3>
            <h4><%=session.getAttribute("notice")%></h4>
        </div>
        <input type="button" value="Print or Save " id="btnPrint" />
    </body>
</html>
