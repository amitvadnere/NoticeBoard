package controller;

import db.userdb;
import dto.NoticeData;
import dto.publishnoticedto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.publishnotice;


public class publishNoticeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            System.out.println("publishnoticeservlet");
            HttpSession session=request.getSession(true);
            publishnoticedto obj=new publishnoticedto();
            obj.setObject((NoticeData)session.getAttribute("NoticeData"));
            obj.setNoticeContent((String) session.getAttribute("ncontent"));
            obj.setNid((String) session.getAttribute("nid"));
            NoticeData nd=(NoticeData)session.getAttribute("NoticeData");
            publishnotice pn=new publishnotice(obj);
            
            
//            System.out.println("checked 0");
         
            if (pn.noticepublished()){
                response.sendRedirect("dashboard.jsp");
            }
            else{
                response.sendRedirect("index.html");
            }
           } catch (SQLException ex) {
            Logger.getLogger(publishNoticeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
     } 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {      
    }

}