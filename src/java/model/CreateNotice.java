package model;

import db.userdb;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateNotice {
    
    private String nsubject,nbody,uid,noticeid;
    public CreateNotice(String nsubject,String nbody,String uid,String noticeid){
        this.nsubject=nsubject;
        this.nbody=nbody;
        this.uid=uid;
        this.noticeid=noticeid;
    }
    
     public void savenotice() throws SQLException{
         userdb db=new userdb();
         Statement st=db.getstatement();
         nbody=nbody.replaceAll("'", "''");
         System.out.println(nbody+" : nbody");
         String sql="Insert into noticecontent values('"+nsubject+"','"+nbody+"','"+noticeid+"');";
         st.execute(sql);
     }
    
}
 