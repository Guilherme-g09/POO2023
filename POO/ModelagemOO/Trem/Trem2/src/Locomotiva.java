public class Locomotiva extends CarroFerroviario {
    private int numMaxVagoes;

    public Locomotiva(int id, int capMax, Trem trem, int numMaxVagoes) {
        super(id, capMax, trem);
        this.setNumMaxVagoes(numMaxVagoes);
    }

    public int getNumMaxVagoes() {
        return numMaxVagoes;
    }

    public void setNumMaxVagoes(int numMaxVagoes) {
        this.numMaxVagoes = numMaxVagoes;
    }

    @Override
    public String toString() {
        return "Locomotiva [" + super.toString() + " numMaxVagoes=" + numMaxVagoes + "]";
    }
}
