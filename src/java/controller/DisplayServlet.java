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

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public void init() throws ServletException {

    }

    public DisplayServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //String imageId = request.getParameter("id");
        InputStream sImage;
        int size=0;
        /*
        if (imageId == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND); // 404.
            return;
        }

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_learning", "root","root");
            stmt = conn.prepareStatement("select * from contacts where contact_id=" + imageId);
            rs = stmt.executeQuery();
            if(rs.next()){
                System.out.println("Inside RS");
                byte[] bytearray = new byte[1048576];
                int size=0;
                sImage = rs.getBinaryStream(4);
                response.reset();
                response.setContentType("image/jpeg");
                while((size = sImage.read(bytearray)) != -1 ){
                    response.getOutputStream().
                    write(bytearray,0,size);
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }*/
            HttpSession session= request.getSession(true);
            sImage=(InputStream)session.getAttribute("pnotice");
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

