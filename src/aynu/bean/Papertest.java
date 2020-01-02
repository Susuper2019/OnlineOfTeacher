package aynu.bean;

/**
 * @Author susuper
 * @Date 2019/12/29 15:13
 * @description:
 */
public class Papertest {
    private Integer pid;
    private Integer cid;
    private String cname;
    private String title;
    private String opta;
    private String optb;
    private String optc;
    private String optd;
    private String reallyopt;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOpta() {
        return opta;
    }

    public void setOpta(String opta) {
        this.opta = opta;
    }

    public String getOptb() {
        return optb;
    }

    public void setOptb(String optb) {
        this.optb = optb;
    }

    public String getOptc() {
        return optc;
    }

    public void setOptc(String optc) {
        this.optc = optc;
    }

    public String getOptd() {
        return optd;
    }

    public void setOptd(String optd) {
        this.optd = optd;
    }

    public String getReallyopt() {
        return reallyopt;
    }

    public void setReallyopt(String reallyopt) {
        this.reallyopt = reallyopt;
    }

    @Override
    public String toString() {
        return "Papertest{" +
                "pid=" + pid +
                ", cid=" + cid +
                ", cname='" + cname + '\'' +
                ", title='" + title + '\'' +
                ", opta='" + opta + '\'' +
                ", optb='" + optb + '\'' +
                ", optc='" + optc + '\'' +
                ", optd='" + optd + '\'' +
                ", reallyopt='" + reallyopt + '\'' +
                '}';
    }
}
