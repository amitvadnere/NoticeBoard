
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Profile;


public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession session=request.getSession(true);
            String uid=session.getAttribute("uid").toString();
            System.out.print("dispaly uid: "+uid);
            Profile profile=new Profile();
            String[] pElement=profile.getProfile(uid);
           
            session.setAttribute("email", pElement[0]);
            session.setAttribute("contactno", pElement[1]);
            session.setAttribute("username", pElement[2]);
            session.setAttribute("gender", pElement[3]);
            session.setAttribute("dob", pElement[4]);
            session.setAttribute("designation", pElement[5]);
            response.sendRedirect("profile.jsp");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String currpaswd=request.getParameter("currentpassword");
            String nwpaswd=request.getParameter("newpassword");
            HttpSession session=request.getSession(true);
            String uid=session.getAttribute("uid").toString();
            Profile pobject=new Profile();
            Boolean status=pobject.updatepassword(uid, currpaswd, nwpaswd);
            if(status){
                response.sendRedirect("profile.jsp");
            }
            else{
                response.sendRedirect("dashboard.jsp");
            }
            }
        
}

