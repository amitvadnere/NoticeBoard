
package controller;

import dto.NoticeData;
import dto.publishnoticedto;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.publishnotice;


public class publishpnServlet extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try{
            System.out.println("publishnoticeservlet");
            HttpSession session=request.getSession(true);
            publishnoticedto obj=new publishnoticedto();
            obj.setObject((NoticeData)session.getAttribute("NoticeData"));
            obj.setNoticeContent((String) session.getAttribute("ncontent"));
            obj.setNid((String) session.getAttribute("nid"));
            System.out.println("image: "+session.getAttribute("pnotice").toString());
            obj.setPnotice((InputStream)session.getAttribute("pnotice"));
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

}
