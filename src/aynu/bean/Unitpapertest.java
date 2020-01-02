package aynu.bean;

/**
 * @Author susuper
 * @Date 2019/12/29 15:13
 * @description:
 */
public class Unitpapertest {
    private Integer upid;
    private Integer cid;
    private String cname;
    private String title;
    private String opta;
    private String optb;
    private String optc;
    private String optd;
    private String reallyopt;
    private Integer uid;

    @Override
    public String toString() {
        return "Unitpapertest{" +
                "upid=" + upid +
                ", cid=" + cid +
                ", cname='" + cname + '\'' +
                ", title='" + title + '\'' +
                ", opta='" + opta + '\'' +
                ", optb='" + optb + '\'' +
                ", optc='" + optc + '\'' +
                ", optd='" + optd + '\'' +
                ", reallyopt='" + reallyopt + '\'' +
                ", uid=" + uid +
                '}';
    }

    public Integer getUpid() {
        return upid;
    }

    public void setUpid(Integer upid) {
        this.upid = upid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

}
