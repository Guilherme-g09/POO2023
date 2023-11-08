import java.util.ArrayList;

public class Trem {
    private int id;
    private ArrayList<CarroFerroviario> carros;

    public Trem() {
        this.carros = new ArrayList<CarroFerroviario>();
    }

    public int getId() {
        return this.id;
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

    public ArrayList<VagaoCarga> getVagoes() {
        ArrayList<VagaoCarga> vagoes = new ArrayList<VagaoCarga>();

        for (CarroFerroviario carro : this.carros) {
            if (carro instanceof VagaoCarga) {
                vagoes.add((VagaoCarga)carro);
            }
        }

        return vagoes;
    }

    public int getQtdVagao() {
        int contador = 0;

        for (CarroFerroviario carro : this.carros) {
            if (carro instanceof VagaoCarga) {
                contador++;
            }
        }

        return contador;
    }

    public void adicionarCarro(CarroFerroviario carro) {
        this.carros.add(carro);
    }

    public boolean adicionarLocomotiva(int idLocomotiva, GaragemFerroviaria garagem) {
        if (this.getQtdVagao() == 0) {
            Locomotiva locomotiva = garagem.getLocomotiva(idLocomotiva);

            if (garagem.removerLocomotiva(locomotiva) != null) {
                this.carros.add(locomotiva);
                return true;
            }
        }
        
        return false;
    }
}
