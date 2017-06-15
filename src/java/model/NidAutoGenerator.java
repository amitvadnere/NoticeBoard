
package model;

import db.userdb;
import dto.NoticeData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NidAutoGenerator {

    public String getNoticeId() throws SQLException {
        String newid=null;
        userdb db=new userdb();
        Statement st=db.getstatement();
        String sql="select * from notice_data";
        ResultSet rs=st.executeQuery(sql);
       
        if(rs.last()){
                String noticeid;
                noticeid=rs.getString(1);
                System.out.println("noticeid::::::"+noticeid);
                String n=noticeid.substring(7, noticeid.length());
                newid="N/2017/"+(Integer.parseInt(n)+1);
        }
        
        else{
            newid="N/2017/1";
        }
        System.out.println("data inserted");
        return newid;
    }
}
    