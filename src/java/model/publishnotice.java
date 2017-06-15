
package model;

import db.userdb;
import dto.NoticeData;
import dto.publishnoticedto;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amit
 */
public class publishnotice{
    NoticeData nd=null;
    String noticecontent=null;
    String nid=null; 
    InputStream pnotice=null;
    
    public publishnotice(publishnoticedto object){
        
        publishnoticedto obj=object;
        noticecontent=obj.getNoticeContent();
        nd= obj.getObject();   
        nid=obj.getNid();
        pnotice=obj.getPnotice();
    }
    
    public boolean noticepublished() throws SQLException{
        
        userdb db=new userdb();    
        Statement st=db.getstatement();
        String sql="insert into notice_data values('"+nid+"','"+nd.uid+"','"+nd.title+"','"+nd.inputtype+"','"+nd.visibility+"','"+nd.noticeType+"','"+nd.endDate+"','"+nd.priority+"','"+noticecontent+"',"+"NULL"+",CURDATE()"+",'"+pnotice+"');";
        System.out.println(sql);
        try {
            st.execute(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
           return false;
        }
           return true; 
    }       
}
