
package controller;

import dto.DisplayNdto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DisplayNotice;

public class DSNServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String nid=request.getParameter("nid");
                System.out.print("nid: "+nid);
                DisplayNdto dndto=new DisplayNdto();
                DisplayNotice dn =new DisplayNotice(nid);
                dndto=dn.getnotice();
                HttpSession session=request.getSession(true);
                session.setAttribute("dnid",dndto.getNid());
                session.setAttribute("dntitle",dndto.getTitle());
                session.setAttribute("dndate",dndto.getDate());
                String inputtype=dndto.getInputtype();
                if(inputtype.equalsIgnoreCase("Manual-Entry")){
                    session.setAttribute("dnbody",dndto.getNbody());
                    response.sendRedirect("defaulttemp.jsp");
                }
                else if(inputtype.equalsIgnoreCase("PhotoNotice")){
                    System.out.println("Pnotice"+dndto.getPnotice());
                    session.setAttribute("Pnotice",dndto.getPnotice());
                     response.sendRedirect("viewpnotice.jsp");
                }
                
    }

}
