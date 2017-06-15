
package model;

import db.userdb;
import java.sql.SQLException;
import java.sql.Statement;


public class EditNotice {
String ncontent,nid,title;
    public boolean EditNoticeContent( String content,String id,String title) throws SQLException {
        
        this.ncontent=content;
        this.nid=id;
        this.title=title;
        userdb db=new userdb();
        Statement st=db.getstatement();
        
        System.out.println(ncontent);
        System.out.println(nid);
        System.out.println(title);
        String sql="Update notice_data set notice_content='"+ncontent+"' , title='"+title+"' where nid='"+nid+"';";
       System.out.println(sql);
        try{
            st.executeUpdate(sql);
        }
        catch(SQLException e){
           System.out.println(e);
           return false;
        }
        return true;
               
    }
    
    
}
