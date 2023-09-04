import java.util.ArrayList;

public class Trem {
    private int id;
    private ArrayList<Locomotiva> locomotivas;
    private ArrayList<Vagao> vagoes;
    private int pesoMax;
    private int pesoAtual;
    private int numMaxVagoes;

    public Trem(int idTrem, Locomotiva primeiraLocomotiva) {
        this.id = idTrem;
        this.locomotivas = new ArrayList<Locomotiva>();
        this.vagoes = new ArrayList<Vagao>();
        this.pesoMax = 0;
        this.numMaxVagoes = 0;

        this.adicionarLocomotiva(primeiraLocomotiva.getId());
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<Locomotiva> getLocomotivas() {
        return this.locomotivas;
    }

    public ArrayList<Vagao> getVagoes() {
        return this.vagoes;
    }

    public boolean adicionarLocomotiva(int idLocomotiva) {
        if (this.vagoes.size() == 0) {
            Locomotiva locomotiva = GaragemLocomotiva.getLocomotiva(idLocomotiva);

            if (GaragemLocomotiva.removerLocomotiva(locomotiva) != null) {
                this.locomotivas.add(locomotiva);
                this.pesoMax += locomotiva.getPesoMax();
                this.calculaNumMaxVagoes();
                
                return true;
            }
        }
        
        return false;
    }

    public boolean adicionarVagao(int idVagao) {
        if (this.locomotivas.size() > 0) {
            
            Vagao vagao = GaragemVagao.getVagao(idVagao);

            if (this.numMaxVagoes > this.vagoes.size() && this.pesoMax >= this.pesoAtual + vagao.getCapMaxCarga()) {
                if (GaragemVagao.removerVagao(vagao) != null) {
                    this.vagoes.add(vagao);
                    this.pesoAtual += vagao.getCapMaxCarga();
                    return true;
                }
            }

        }

        return false;
    }

    public boolean removerUltimoElemento() {
        if (this.vagoes.size() > 0) {
            int ultimoElemento = this.vagoes.size() - 1;
            return this.removerVagao(ultimoElemento);
        } else {
            if (this.locomotivas.size() > 1) {
                int ultimoElemento = this.locomotivas.size() - 1;
                return this.removerLocomotiva(ultimoElemento);
            }
        }

        return false;
    }

    public boolean desfazerTrem() {
        for (int index = this.vagoes.size() - 1; index >= 0; index--) {
            removerVagao(index);
        }

        for (int index = this.locomotivas.size() - 1; index >= 0; index--) {
            removerLocomotiva(index);
        }

        return true;
    }

    private boolean removerLocomotiva(int index) {
        Locomotiva locomotiva = this.locomotivas.remove(index);
        this.pesoMax -= locomotiva.getPesoMax();
        locomotiva.setTrem(null);
        this.calculaNumMaxVagoes();
        GaragemLocomotiva.estacionarLocomotiva(locomotiva);
        return true;
    }

    private boolean removerVagao(int index) {
        Vagao vagao = this.vagoes.remove(index);
        this.pesoAtual -= vagao.getCapMaxCarga();
        vagao.setTrem(null);
        GaragemVagao.estacionarVagao(vagao);
        return true;
    }

    private void calculaNumMaxVagoes() {
        this.numMaxVagoes = 0;
        for (Locomotiva loc : this.locomotivas) {
            this.numMaxVagoes += loc.getNumMaxVagoes();
        }
        
        if (this.locomotivas.size() > 1) {
            this.numMaxVagoes = this.numMaxVagoes * (100 - (this.locomotivas.size() - 1) * 10) / 100;
        }
    }

    @Override
    public String toString() {
        String trem = "";

        for (Locomotiva locomotiva : locomotivas) {
            trem += locomotiva.toString();
        }

        for (Vagao vagao : vagoes) {
            trem += vagao.toString();
        }

        return trem;
    }
}
