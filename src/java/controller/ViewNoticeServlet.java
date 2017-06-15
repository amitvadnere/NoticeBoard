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


public class ViewNoticeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            System.out.println("viewNoticeServlet");
             HttpSession session=request.getSession();
            String uid=(String) session.getAttribute("uid");
            ViewNotice vn= new ViewNotice();
            ArrayList<String> noticeContent = new ArrayList<String>(); 
            noticeContent=vn.getNotice(uid);
            String nContent = new Gson().toJson(noticeContent);
            session.setAttribute("getNoticeContent", nContent);
            
            response.sendRedirect("viewnotice.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
