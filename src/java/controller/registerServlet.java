package controller;

import dto.signupdto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.signup;

public class registerServlet extends HttpServlet {

    
        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
                String name = request.getParameter("name");
                String email= request.getParameter("email");
                String paswrd=request.getParameter("paswrd");
                String gender=request.getParameter("gender");
                String dob=request.getParameter("dob");
                String designation=request.getParameter("designation");
                String number=request.getParameter("contact");
                int no=Integer.parseInt(number);
                signupdto sup=new signupdto();
                sup.setName(name);
                sup.setEmail(email);
                sup.setPaswrd(paswrd);
                sup.setContact(no);
                sup.setDesignation(designation);
                sup.setGender(gender);
                sup.setDob(dob);
                signup supo=null;
            try {
                supo = new signup(sup);
            } catch (SQLException ex) {
                Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if(supo.getRegistered()) {
                    response.sendRedirect("index.html");
                } 
                else{
                    response.sendRedirect("signup.jsp");
                }
            } catch (SQLException ex) {
                Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    


}
