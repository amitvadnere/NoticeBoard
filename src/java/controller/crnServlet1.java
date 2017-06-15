package controller;

import dto.NoticeData;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "crnServlet1", urlPatterns = {"/crnServlet1"})
public class crnServlet1 extends HttpServlet {

    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("here");
        HttpSession session=request.getSession(true);
        String uid=session.getAttribute("uid").toString();
  
        String spriority=request.getParameter("priority");
        String title=request.getParameter("title");
        int priority=Integer.parseInt(spriority);
        String visibility=request.getParameter("visibility");
        String noticeType=request.getParameter("NoticeType");
        String endDate=request.getParameter("EndDate");
        String inputtype=request.getParameter("InputType");
        
        
        
        System.out.println("abc");
        
        NoticeData obj=new NoticeData(uid, title, inputtype,visibility, noticeType,endDate,priority);
        //ArrayList<NoticeData> nd=new ArrayList();
        System.out.println("abc1");
       // nd.add(obj);
       
        session.setAttribute("uid",uid);
     
        session.setAttribute("NoticeData", obj);
        session.setAttribute("inputtype", obj.inputtype);
        response.sendRedirect("createnoticepart2.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             response.sendRedirect("index.html");
    }

}
