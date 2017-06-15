package controller;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ViewPNotice")
public class ViewPNotice extends HttpServlet {
    private static final long serialVersionUID = 1L;
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public void init() throws ServletException {

    }

    public ViewPNotice() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("inside photonotice servlet");
        InputStream sImage;
        int size=0;
            HttpSession session= request.getSession(true);
            System.out.println((InputStream)session.getAttribute("Pnotice")+" PHOTO NOTICE SERVELET");
            sImage=(InputStream)session.getAttribute("Pnotice");
            System.out.println("abc"+sImage);
            byte[] bytearray = new byte[1048576];
            // response.setContentType("image/jpeg");
                while((size = sImage.read(bytearray)) != -1 ){
                    response.getOutputStream().
                    write(bytearray,0,size);
                }response.setContentType("image/jpeg");
                while((size = sImage.read(bytearray)) != -1 ){
                    response.getOutputStream().
                    write(bytearray,0,size);
                }
    }
}

