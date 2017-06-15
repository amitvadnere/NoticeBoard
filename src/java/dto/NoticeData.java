package dto;
public class NoticeData {
    public String uid, title, inputtype,visibility, noticeType,endDate;
    public int priority;
    public NoticeData(String uid,String  title,String inputtype,String visibility,String noticeType,String endDate,int priority){
        this.uid=uid;
        this.title=title;
        this.inputtype=inputtype;
        this.visibility=visibility;
        this.noticeType=noticeType;
        this.endDate=endDate;
        this.priority=priority;
    }
    
}
