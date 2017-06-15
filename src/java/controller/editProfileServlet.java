
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Profile;

public class editProfileServlet extends HttpServlet {
  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String email=request.getParameter("email");
         String contact=request.getParameter("contactno");
        HttpSession session=request.getSession(true);
        String uid=session.getAttribute("uid").toString();
        Profile profileobj =new Profile();
       
        boolean sf=profileobj.SaveProfile(uid,contact,email);
        if(sf==true){
        response.sendRedirect("profile.jsp");
        }
        else{
        response.sendRedirect("dashboard.jsp");
        }       
       
    }
            

     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
     }
}
   
    
  