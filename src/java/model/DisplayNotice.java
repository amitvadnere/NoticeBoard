
package model;

import db.userdb;
import dto.DisplayNdto;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisplayNotice {
    private String nid;
    private Statement st=null;
    private ResultSet rs;
    private DisplayNdto dndto;
    public DisplayNotice(String nid){
         this.nid=nid;
         userdb db =new userdb();
         st=db.getstatement();
     }
     public DisplayNdto getnotice(){
          String sql="SELECT * FROM notice_data WHERE nid= '"+nid+"';";
            System.out.println(sql);
             try {
                rs=st.executeQuery(sql);
                dndto=new DisplayNdto();
                if(rs.next()){
                     dndto.setDate(rs.getString(11));
                     dndto.setNbody(rs.getString(9));
                     dndto.setNid(nid);
                     dndto.setTitle(rs.getString(3));
                     dndto.setInputtype(rs.getString(4));
                     
                      Blob pnotice=rs.getBlob("pnotice");
                      System.out.println("pnotice in dispalynotice model:"+ pnotice);
                    if(pnotice!=null){
                        System.out.println("Displaynotice model is start here");
                        dndto.setPnotice((pnotice));
                        System.out.println("Displaynotice model is done here");
                    }
               }
             }
            catch (SQLException ex) {
            Logger.getLogger(ViewNotice.class.getName()).log(Level.SEVERE, null, ex);
            }
            return dndto;
        
     }
}
