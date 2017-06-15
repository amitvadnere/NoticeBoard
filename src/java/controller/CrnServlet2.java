
package controller;

import dto.NoticeData;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.NidAutoGenerator;

/**
 *
 * @author Amit
 */
@MultipartConfig(maxFileSize = 16177215) 
public class CrnServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       
       
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("photoEntry");
        String notice=null;
        Part image;
        HttpSession session= request.getSession(true);
        NoticeData nd=(NoticeData)session.getAttribute("NoticeData");
        String uid=session.getAttribute("uid").toString();
        String name=session.getAttribute("Name").toString();
        String Inputtype=nd.inputtype;
        session.setAttribute("title", nd.title);
        if(Inputtype.equalsIgnoreCase("Manual-Entry")){
            notice=request.getParameter("noticem");
            session.setAttribute("ncontent", notice);
            NidAutoGenerator newid=new NidAutoGenerator();
            try {
                String nid=newid.getNoticeId();
                 session.setAttribute("nid", nid);
                
            } catch (SQLException ex) {
                Logger.getLogger(CrnServlet2.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(nd.title);
            System.out.println(notice);
            response.sendRedirect("tselector.jsp");             
        }
        else if(Inputtype.equalsIgnoreCase("PhotoNotice")){
            image=request.getPart("phototnotice");
            InputStream noticephoto=null;
           
            if (image != null) {
           
            System.out.println(image.getName());
            System.out.println(image.getSize());
            System.out.println(image.getContentType());
             
 
            noticephoto = image.getInputStream();
        }    
            session.setAttribute("pnotice", noticephoto);
            session.setAttribute("uid",uid);
            response.sendRedirect("UnderConstruction.html");
        }
        else{
            response.sendRedirect("index.html");
            System.out.println(Inputtype);
        }
      
    }
}

