package dto;

import java.io.InputStream;

public class publishnoticedto {
    private NoticeData object;
    private String noticeContent;
    private String nid;
    private InputStream pnotice;
    
    
    public NoticeData getObject() {
        return object;
    }
    
   public void setObject(NoticeData object) {
        this.object = object;
    }
   
    public String getNoticeContent() {
        return noticeContent;
    }
    
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }
    
    public String getNid() {
        return nid;
    }
    
    public void setNid(String nid) {
        this.nid = nid;
    }
    public InputStream getPnotice() {
        return pnotice;
    }

    public void setPnotice(InputStream pnotice) {
        this.pnotice = pnotice;
    }
    
}
