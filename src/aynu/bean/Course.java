package aynu.bean;

import java.util.Date;

/**
 * @Author susuper
 * @Date 2019/12/28 15:46
 * @description:
 */
public class Course {
    private int cid;
    private int tid;
    private String cname;
    private String ctype;
    private String semester;
    private Date starttime;
    private Date endtime;
    private int stunum;
    private String subtype;
    private String courdesc;
    private String earlystudy;

    private int statue;

    private int aid;

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", tid=" + tid +
                ", cname='" + cname + '\'' +
                ", ctype='" + ctype + '\'' +
                ", semester='" + semester + '\'' +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", stunum=" + stunum +
                ", subtype='" + subtype + '\'' +
                ", courdesc='" + courdesc + '\'' +
                ", earlystudy='" + earlystudy + '\'' +
                ", statue=" + statue +
                ", aid=" + aid +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public int getStunum() {
        return stunum;
    }

    public void setStunum(int stunum) {
        this.stunum = stunum;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getCourdesc() {
        return courdesc;
    }

    public void setCourdesc(String courdesc) {
        this.courdesc = courdesc;
    }

    public String getEarlystudy() {
        return earlystudy;
    }

    public void setEarlystudy(String earlystudy) {
        this.earlystudy = earlystudy;
    }

    public int getStatue() {
        return statue;
    }

    public void setStatue(int statue) {
        this.statue = statue;
    }

}
