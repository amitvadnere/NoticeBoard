
package model;

import db.userdb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Profile {

    public String[] getProfile(String uid) {
        String[] userdata=new String[6];
        userdb udb=new userdb();
        Statement st=udb.getstatement();
        String sql="select * from userdb where uid='"+uid+"' ";
        try {
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                //String email,cont,email,gender,dob,designation;
                userdata[0]=rs.getString(9);//name
                userdata[1]=rs.getString(7);//cont
                userdata[2]=rs.getString(1);//email
                userdata[3]=rs.getString(5);//gender
                userdata[4]=rs.getString(6);//dob
                userdata[5]=rs.getString(8);//designation
            }
        
            
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
         return userdata;
    }
    public boolean SaveProfile(String uid,String contact,String email){
        int x=0,contact1;
        userdb udb=new userdb();
        Statement st=udb.getstatement();
        System.out.println("contact:"+contact);
       
        String sql="Update userdb set email='"+email+"',contact_no='"+contact+"' where uid='"+uid+"';";
        System.out.println(sql);
        try {
           x= st.executeUpdate(sql);
            System.out.println("value of x : "+x);
         
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
          if(x!=0){
           return true;
           }
          else{
               return false;
          }
    }
    public boolean updatepassword(String uid,String currpaswd,String nwpaswd){
        userdb udb=new userdb();
        Statement st=udb.getstatement();
        String sql="Update userdb set userdb.password='"+nwpaswd+"'where uid='"+uid+"' and userdb.password='"+currpaswd+"';";
        System.out.println(sql);
        try {
            st.executeUpdate(sql);
            return true;
         
        } catch (SQLException ex) {
            System.out.println(ex);
           return false;
        }
    }
}


    
