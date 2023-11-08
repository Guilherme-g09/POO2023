public class CarroFerroviario {
    private int id;
    private int capCarga;
    private Trem trem;

    public CarroFerroviario(int id, int capCarga, Trem trem) {
        this.id = id;
        this.capCarga = capCarga;
        this.trem = trem;
    }

    public int getId() {
        return id;
    }

    public int getCapCarga() {
        return capCarga;
    }
    public Trem getTrem() {
        return trem;
    }

    @Override
    public String toString() {
        return "id=" + id + ", capCarga=" + capCarga + ", trem=" + trem;
    }
}
