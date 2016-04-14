package ayaseruri.torr.torrfm.objectholder;

/**
 * Created by ayaseruri on 15/12/13.
 */
public class LrcInfo {
    private long time;
    private String jp;
    private String cn;

    public LrcInfo(long time, String jp, String cn) {
        this.time = time;
        this.jp = jp;
        this.cn = cn;
    }

    public long getTime() {
        return time;
    }

    public String getJp() {
        return jp;
    }

    public String getCn() {
        return cn;
    }
}
