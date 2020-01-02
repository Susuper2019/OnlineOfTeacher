package aynu.bean;

/**
 * @Author susuper
 * @Date 2019/12/28 15:31
 * @description:
 */
public class Teacher {
    private Integer tid;
    private String tuesr;  //账户
    private String tpassword;
    private String tname;


    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tuesr='" + tuesr + '\'' +
                ", tpassword='" + tpassword + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }

    public String getTuesr() {
        return tuesr;
    }

    public void setTuesr(String tuesr) {
        this.tuesr = tuesr;
    }


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
