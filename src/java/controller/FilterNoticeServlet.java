
package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ViewNotice;


public class FilterNoticeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                HttpSession session=request.getSession();
                String uid=(String) session.getAttribute("uid");
                String option=request.getParameter("filter_opt");
                ArrayList noticeContent=new ArrayList();
                if(option.equals("month")){
                    String month2=request.getParameter("m");
                    System.out.println("check 1 :"+month2+"******************** uid : "+uid);
                    ViewNotice fn= new ViewNotice();
                    System.out.println("check 2 :"+month2+"********************" );
                    
                    try{
                        noticeContent=(ArrayList) fn.filterNoticeByMonth(month2, uid);
                        
                    }catch (SQLException ex) {
                        Logger.getLogger(FilterNoticeServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                          
                    System.out.println("check 3 :"+month2+"******************** uid : ");
                    System.out.println("check 4 :"+month2+"******************** uid : ");
                }
                else if(option.equals("year")){
                    String year2=request.getParameter("y");
                    ViewNotice fn= new ViewNotice();
                    noticeContent=(ArrayList)fn.filterNoticeByYear(year2, uid);
                }
                String nContent = new Gson().toJson(noticeContent);
                session.setAttribute("getncontent", nContent);//yaha arraylist ka object session me daal rahe hain
                response.sendRedirect("viewNotice1.jsp");
    }

}