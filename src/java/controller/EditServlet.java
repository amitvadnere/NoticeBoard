
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EditNotice;


public class EditServlet extends HttpServlet {

  
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String Updated_Content=request.getParameter("ncontent");
      String nid1=request.getParameter("nid");
      String ntitle=request.getParameter("ntitle");
      
        try {
           
            EditNotice n=new EditNotice();
            boolean status =n.EditNoticeContent(Updated_Content,nid1,ntitle);
            if(status==true)
            {
                response.sendRedirect("viewnotice.jsp");
            }
            else
            {
                response.sendRedirect("dashboard.jsp");
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(EditServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

   
  
}