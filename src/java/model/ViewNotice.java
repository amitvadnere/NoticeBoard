package model;

import db.userdb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

public class ViewNotice {
    userdb db= new userdb();
    Statement st=null;
    ArrayList<String> title = new ArrayList<String>();    
    ArrayList<String> date = new ArrayList<String>();
    ArrayList<String> noticeType = new ArrayList<String>();
    ArrayList<String> noticeId = new ArrayList<String>();
    ArrayList<String> noticePriority = new ArrayList<String>();
    ArrayList arr=new ArrayList();
    int row_no=0; 
   
    public ViewNotice(){
        db=new userdb();
        st=db.getstatement();
        title.clear();
        date.clear();
        noticeType.clear();
        noticeId.clear();
        arr.clear();
    }
    
    public ArrayList getNotice(String uid){
       
        ResultSet r=null;
        String sql="select * from notice_data where uid='"+uid+"';";
        try {
                r=st.executeQuery(sql);  
                
                if(r.next()){
                    row_no=r.getRow();
                    System.out.println("row no. = "+row_no);                
                    do{
                        title.add(r.getString(3));
                        date.add(r.getString(11));
                        noticeType.add(r.getString(6));
                        noticeId.add(r.getString(1));
                        System.out.println(title);
                        System.out.println(date);
                        row_no=r.getRow();
                        System.out.println("row no. = "+row_no);
                    }while(r.next());
                 
                    arr.add(title);
                    arr.add(date);
                    arr.add(row_no);
                    arr.add(noticeType);
                    arr.add(noticeId);
                }
              
            }
        catch (SQLException ex) {
            Logger.getLogger(ViewNotice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
      public ArrayList getNotice(int year){
       
        ResultSet r=null;
        String sql="select * from notice_data where visiblity="+year+" AND end_date >CAST(CURRENT_TIMESTAMP AS DATE)" ;


        System.out.println(sql);
        try {
                r=st.executeQuery(sql);  
                
                if(r.next()){
                    row_no=r.getRow();
                    System.out.println("row no. = "+row_no);                
                    do{
                        title.add(r.getString(3));
                        date.add(r.getString(11));
                        noticeType.add(r.getString(6));
                        noticeId.add(r.getString(1));
                        noticePriority.add(r.getString(8));
                        System.out.println(title);
                        System.out.println(date);
                        row_no=r.getRow();
                        System.out.println("row no. = "+row_no);
                    }while(r.next());
                 
                    arr.add(title);
                    arr.add(date);
                    arr.add(row_no);
                    arr.add(noticeType);
                    arr.add(noticeId);
                    arr.add(noticePriority);
                }
              
            }
        catch (SQLException ex) {
            Logger.getLogger(ViewNotice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }        
  
    public ArrayList filterNoticeByMonth(String mon,String uid) throws SQLException{
        ResultSet r=null;
        int month = Integer.parseInt(mon);
        String sql="SELECT * FROM notice_data WHERE MONTH(PublishDate)="+ month +" and uid='"+uid+"';";
        System.out.println(sql);
        try {
                r=st.executeQuery(sql);
                
                if(r.next()){
                    row_no=r.getRow();
                    System.out.println("row no. = "+row_no);                
                    do{
                        
                        title.add(r.getString(3));
                        date.add(r.getString(11));
                        noticeType.add(r.getString(6));
                        noticeId.add(r.getString(1));
                        System.out.println(title);
                        System.out.println(date);
                        row_no=r.getRow();
                        System.out.println("row no. = "+row_no);
                    }while(r.next());
                 
                    arr.add(title);
                    arr.add(date);
                    arr.add(row_no);
                    arr.add(noticeType);
                    arr.add(noticeId);
                } 
            }
            catch (SQLException ex) {
            Logger.getLogger(ViewNotice.class.getName()).log(Level.SEVERE, null, ex);
            }
            return arr;
        }
          
        public ArrayList filterNoticeByYear(String var2,String uid){

            ResultSet r=null;
            int year = Integer.parseInt(var2);
            String sql="SELECT * FROM notice_data WHERE YEAR(PublishDate)= "+ year +" and uid='"+uid+"';";
            System.out.println(sql);
             try {
                r=st.executeQuery(sql);
                
                if(r.next()){
                    row_no=r.getRow();
                    System.out.println("row no. = "+row_no);                
                    do{
                        
                        title.add(r.getString(3));
                        date.add(r.getString(11));
                        noticeType.add(r.getString(6));
                        noticeId.add(r.getString(1));
                        System.out.println(title);
                        System.out.println(date);
                        row_no=r.getRow();
                        System.out.println("row no. = "+row_no);
                    }while(r.next());
                 
                    arr.add(title);
                    arr.add(date);
                    arr.add(row_no);
                    arr.add(noticeType);
                    arr.add(noticeId);
                } 
            }
            catch (SQLException ex) {
            Logger.getLogger(ViewNotice.class.getName()).log(Level.SEVERE, null, ex);
            }
            return arr;
        
        }
}     
    

