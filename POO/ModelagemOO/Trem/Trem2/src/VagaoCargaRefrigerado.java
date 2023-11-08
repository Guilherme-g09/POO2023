public class VagaoCargaRefrigerado extends VagaoCarga {
    private int temperaturaMinima;

    public VagaoCargaRefrigerado(int id, int capMax, Trem trem, int temperaturaMinima) {
        super(id, capMax, trem);
        this.setTemperaturaMinima(temperaturaMinima);
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public String toString() {
        return "VagaoCargaRefrigerado [" + super.toString() + " temperaturaMinima=" + temperaturaMinima + "]";
    }
}
