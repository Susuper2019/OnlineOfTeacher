package aynu.bean;

/**
 * @Author susuper
 * @Date 2019/12/29 18:13
 * @description:
 */
public class Fileup {
    private int fileid;
    private String ufile;
    private Integer uid;

    public int getFileid() {
        return fileid;
    }

    public void setFileid(int fileid) {
        this.fileid = fileid;
    }

    public String getUfile() {
        return ufile;
    }

    public void setUfile(String ufile) {
        this.ufile = ufile;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Fileup{" +
                "fileid=" + fileid +
                ", ufile='" + ufile + '\'' +
                ", uid=" + uid +
                '}';
    }
}
