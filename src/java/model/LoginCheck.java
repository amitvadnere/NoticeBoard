package model;

import db.userdb;
import controller.LoginServlet;
import dto.userchecklogindto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginCheck {
    String username,password;
    String uid ,name;
    public LoginCheck(String uname,String Password){
        username=uname;
        password=Password;
    }
    public boolean usercheck() throws SQLException{
        userdb db=new userdb();
        Statement st = db.getstatement();
        String sql="SELECT * FROM userdb WHERE uname='"+username+"' && userdb.`password`='"+password+"';";
        System.out.println(sql);
        ResultSet rs = st.executeQuery(sql);
        if(!rs.next()){
           // rs.beforeFirst();
            return false;
        }
        else{
            //rs.beforeFirst();
            return true;
        }
    }
    public String getUid() throws SQLException{
        
        userdb db=new userdb();
        Statement st = db.getstatement();
        String sql="SELECT * FROM userdb WHERE uname='"+ username +"';";
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next()){
            uid=rs.getString(3);
            name=rs.getString(4);
        }
         return uid;
    
    } 
    public String getName(){
        return name;
    }
   
}
