import java.util.ArrayList;

public class GaragemFerroviaria {
    private ArrayList<CarroFerroviario> carros;

    public GaragemFerroviaria() {
        this.carros = new ArrayList<CarroFerroviario>();
    }

    public ArrayList<CarroFerroviario> getCarros() {
        return this.carros;
    }

    public void estacionarCarro(CarroFerroviario carro) {
        this.carros.add(carro);
    }

    public int getQtdLocomotiva() {
        int contador = 0;

        for(CarroFerroviario carro : this.getCarros()) {
            if (carro instanceof Locomotiva) {
                contador++;
            }
        }

        return contador;
    }

    public ArrayList<Locomotiva> getLocomotivas() {
        ArrayList<Locomotiva> locomotivas = new ArrayList<Locomotiva>();

        for (CarroFerroviario carro : this.carros) {
            if (carro instanceof Locomotiva) {
                locomotivas.add((Locomotiva)carro);
            }
        }

        return locomotivas;
    }

    public Locomotiva getLocomotiva(int idLocomotiva) {
        return this.getLocomotivas().stream().filter(loc -> loc.getId() == idLocomotiva).findFirst().orElse(null);
    }

    public void removerLocomotiva() {
        
    }
}