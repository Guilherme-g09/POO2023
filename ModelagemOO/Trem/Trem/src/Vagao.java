public class Vagao {
    private int id;
    private int capMaxCarga;
    private Trem trem;
    private static int nextId = 1;

    public Vagao(int capMaxCarga) {
        this.id = nextId;
        this.capMaxCarga = capMaxCarga;
        this.trem = null;

        nextId++;
    }

    public int getId() {
        return this.id;
    }

    public int getCapMaxCarga() {
        return this.capMaxCarga;
    }

    public Trem getTrem() {
        return this.trem;
    }

    public void setTrem(Trem trem) {
        this.trem = trem;
    }

    @Override
    public String toString() {
        return "-[˳˳_" + this.capMaxCarga + "_˳˳]";
    }
}
