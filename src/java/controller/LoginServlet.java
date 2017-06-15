
package controller;

import dto.userchecklogindto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginCheck;

public class LoginServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
        
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uname,password;
        uname=request.getParameter("uname");
        password=request.getParameter("password");
        userchecklogindto udto=new userchecklogindto();
        udto.setUname(uname);
        udto.setPassword(password);
        HttpSession session =request.getSession(true);
        LoginCheck lc=new LoginCheck(udto.getUname(),udto.getPassword());
        try {
            if(lc.usercheck()==true){
                String uid=lc.getUid();
                String name=lc.getName();
                session.setAttribute("uid",uid);
                session.setAttribute("Name",name);
                response.sendRedirect("dashboard.jsp");
            }
            else{
                response.sendRedirect("index.html");
            }
                } 
        catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
