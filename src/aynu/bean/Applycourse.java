package aynu.bean;

import java.util.Date;

/**
 * @Author susuper
 * @Date 2019/12/28 16:26
 * @description:
 */
public class Applycourse {
    private int aid;
    private int tid;
    private String acname;
    private String actype;
    private String accategory;
    private int teachernum;

    private String extreaTecName;
    private String extreaTecUser;
    private Date applytime;
    public String getExtreaTecName() {
        return extreaTecName;
    }

    public void setExtreaTecName(String extreaTecName) {
        this.extreaTecName = extreaTecName;
    }

    public String getExtreaTecUser() {
        return extreaTecUser;
    }

    public void setExtreaTecUser(String extreaTecUser) {
        this.extreaTecUser = extreaTecUser;
    }

    @Override
    public String toString() {
        return "Applycourse{" +
                "aid=" + aid +
                ", tid=" + tid +
                ", acname='" + acname + '\'' +
                ", actype='" + actype + '\'' +
                ", accategory='" + accategory + '\'' +
                ", teachernum=" + teachernum +
                ", extreaTecName='" + extreaTecName + '\'' +
                ", extreaTecUser='" + extreaTecUser + '\'' +
                ", applytime=" + applytime +
                '}';
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    public String getActype() {
        return actype;
    }

    public void setActype(String actype) {
        this.actype = actype;
    }

    public String getAccategory() {
        return accategory;
    }

    public void setAccategory(String accategory) {
        this.accategory = accategory;
    }

    public int getTeachernum() {
        return teachernum;
    }

    public void setTeachernum(int teachernum) {
        this.teachernum = teachernum;
    }

}
