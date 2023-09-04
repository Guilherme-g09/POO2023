public class Locomotiva {
    private int id;
    private int pesoMax;
    private int numMaxVagoes;
    private Trem trem;
    private static int nextId = 1;

    public Locomotiva(int pesoMax, int numMaxVagoes) {
        this.id = nextId;
        this.pesoMax = pesoMax;
        this.numMaxVagoes = numMaxVagoes;
        this.trem = null;

        nextId++;
    }

    public int getId() {
        return this.id;
    }

    public int getPesoMax() {
        return this.pesoMax;
    }

    public int getNumMaxVagoes() {
        return this.numMaxVagoes;
    }

    public Trem getTrem() {
        return this.trem;
    }

    public void setTrem(Trem trem) {
        this.trem = trem;
    }

    @Override
    public String toString() {
        return "/˳˳|" + this.id + "|˳˳!:";
    }
}
