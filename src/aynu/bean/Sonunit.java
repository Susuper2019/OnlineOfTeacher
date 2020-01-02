package aynu.bean;

/**
 * @Author susuper
 * @Date 2019/12/29 10:30
 * @description:
 */
public class Sonunit {
    private Integer suid;
    private Integer uid;
    private String suarticle;
    private Integer tid;
    private Integer cid;

    @Override
    public String toString() {
        return "Sonunit{" +
                "suid=" + suid +
                ", uid=" + uid +
                ", suarticle='" + suarticle + '\'' +
                ", tid=" + tid +
                ", cid=" + cid +
                '}';
    }

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSuarticle() {
        return suarticle;
    }

    public void setSuarticle(String suarticle) {
        this.suarticle = suarticle;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}
