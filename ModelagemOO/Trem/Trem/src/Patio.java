import java.util.ArrayList;

public class Patio {
    private ArrayList<Trem> trens;
    private int qtdTrens = 0;

    public Patio() {
        this.trens = new ArrayList<Trem>();
    }

    public ArrayList<Trem> getTrens() {
        return this.trens;
    }

    public int getQtdTrens() {
        return this.qtdTrens;
    }

    public Trem getTrem(int idTrem) {
        return this.trens.stream().filter(t -> t.getId() == idTrem).findAny().orElse(null);
    }

    public void adicionarTrem(int idTrem, Locomotiva locomotiva) {
        Trem trem = new Trem(idTrem, locomotiva);
        this.trens.add(trem);
        this.qtdTrens++;
    }

    public boolean removerTrem(int idTrem) {
        Trem trem = this.getTrem(idTrem);

        if (trem == null) {
            return false;
        }
        
        trem.desfazerTrem();
        this.trens.remove(trem);
        this.qtdTrens--;
        
        return true;
    }

    @Override
    public String toString() {
        String patio = "";

        for (Trem trem : this.trens) {
            patio += "\t" + trem.getId() + " - " + trem.toString() + "\n";
        }

        return patio;
    }
}
