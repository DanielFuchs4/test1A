public class Zvire {

    private String jmeno;
    private String druh;
    private int vek;

    public Zvire(String jmeno, String druh, int vek) {
        this.jmeno = jmeno;
        this.druh = druh;
        this.vek = vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getDruh() {
        return druh;
    }

    public int getVek() {
        return vek;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    @Override
    public String toString() {
        return jmeno + ", " + druh + ", " + vek;
    }
}
