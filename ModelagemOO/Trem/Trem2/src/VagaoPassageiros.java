public class VagaoPassageiros extends CarroFerroviario {
    private int numAssentos;

    public VagaoPassageiros(int id, int numAssentos, Trem trem) {
        super(id, numAssentos * 120, trem);
        this.setNumAssentos(numAssentos);
    }

    public int getNumAssentos() {
        return numAssentos;
    }

    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }

    @Override
    public String toString() {
        return "VagaoPassageiros [" + super.toString() + " numAssentos=" + numAssentos + "]";
    }
}
