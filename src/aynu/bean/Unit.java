package aynu.bean;

/**
 * @Author susuper
 * @Date 2019/12/29 10:29
 * @description:
 */
public class Unit {
    private Integer uid;
    private String uarticle;
    private Integer cid;
    private Integer tid;

    @Override
    public String toString() {
        return "Unit{" +
                "uid=" + uid +
                ", uarticle='" + uarticle + '\'' +
                ", cid=" + cid +
                ", tid=" + tid +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUarticle() {
        return uarticle;
    }

    public void setUarticle(String uarticle) {
        this.uarticle = uarticle;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}
