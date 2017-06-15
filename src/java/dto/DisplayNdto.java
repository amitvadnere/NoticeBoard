
package dto;

import java.io.InputStream;
import java.sql.Blob;

public class DisplayNdto {
    private String nid;
    private String title;
    private String nbody;
    private String date;
    private String inputtype;
    private Blob pnotice;
    private int priority;
    
    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNbody() {
        return nbody;
    }

    public void setNbody(String nbody) {
        this.nbody = nbody;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype;
    }
    
    public Blob getPnotice() {
        return pnotice;
    }
    
    public void setPnotice(Blob pnotice) {
        this.pnotice = pnotice;
    }
}
