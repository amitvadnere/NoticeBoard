package model;

import db.userdb;
import dto.signupdto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class signup {
    String name,email,password,designation,gender,dob,uid;
    int contact;
    public signup(signupdto signup) throws SQLException{
    signupdto sup= signup;
    name=sup.getName();
    email=sup.getEmail();
    password=sup.getPaswrd();
    contact=sup.getContact();
    designation=sup.getDesignation();
    gender=sup.getGender();
    dob=sup.getDob();
    uid=getUid();
}

public boolean getRegistered() throws SQLException{
    userdb db= new userdb();
    Statement st =db.getstatement();
    
    int x=0;
    String sql="insert into userdb values('"+email+"','"+password+"','"+uid+"','"+name+"','"+gender+"','"+dob+"','"+contact+"','"+designation+"','"+email+"');";
    st.execute(sql);
    
    return true;
}
public String getUid() throws SQLException{
    userdb db= new userdb();
    Statement st =db.getstatement();
    int rowno=0;
    String uid;
       ResultSet r=null;
        String sql="select * from userdb;";
        try {
                r=st.executeQuery(sql);  
                
                if(r.next()){
                    rowno=r.getRow();
                    System.out.println("row no. = "+rowno);                
                    do{
                        rowno=r.getRow();
                        System.out.println("row no. = "+rowno);
                    }while(r.next());
                    
                }    
        }
        catch(Exception e){
            System.out.println(e);
         }
        uid="enbu"+rowno;
    return uid;
}
}