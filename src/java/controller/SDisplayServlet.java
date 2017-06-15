
package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ViewNotice;

public class SDisplayServlet extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            System.out.println("here");
            int studentyear=Integer.parseInt(request.getParameter("year"));
            ViewNotice vn=new ViewNotice();
            HttpSession session=request.getSession(true);
            session.setAttribute("visibility", studentyear);
            ArrayList<String> noticeContent = new ArrayList<String>(); 
            noticeContent=vn.getNotice(studentyear);
            String nContent = new Gson().toJson(noticeContent);
            session.setAttribute("getNotice", nContent);
            response.sendRedirect("noticeboard.jsp");

            
    }

}
