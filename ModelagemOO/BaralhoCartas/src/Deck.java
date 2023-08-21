import java.util.Random;

public class Deck {
    public final int TAMANHO = 104;
    private Random r;
    private Carta[] cartas;
    private int proxLivre;

    public Deck() {
        cartas = new Carta[TAMANHO];
        proxLivre = 0;
        r = new Random();
    }

    public boolean insereEmbaixo(Carta carta) {
        if (proxLivre < TAMANHO - 1) {
            cartas[proxLivre] = carta;
            if (carta.isAberto()) {
                carta.viraCarta();
            }
            proxLivre++;
            return true;
        }
        return false;
    }

    public void insereVariasEmbaixo(Carta[] cartas) {
        for (Carta carta : cartas) {
            insereEmbaixo(carta);
        }
    }

    public Carta retiraDeCima() {
        // Se o deck esta vazio retorna null
        if (proxLivre == 0) {
            return null;
        }
        // Se tem carta retira a de cima
        Carta deCima = cartas[0];
        for (int i = 0; i < proxLivre - 1; i++) {
            cartas[i] = cartas[i + 1];
        }
        cartas[proxLivre - 1] = null;
        proxLivre--;
        return deCima;
    }

    public Carta[] retiraTodas() {
        // Retira todas as cartas do deck e retorna
        Carta[] cartasRetiradas = new Carta[proxLivre];
        for (int i = 0; i < TAMANHO; i++) {
            Carta cartaRetirada = retiraDeCima();
            
            if (cartaRetirada == null) {
                break;
            }

            cartasRetiradas[i] = cartaRetirada;
        }
        return cartasRetiradas;
    }

    public int qtdadeCartas() {
        return proxLivre;
    }

    public boolean vazio() {
        return qtdadeCartas() == 0;
    }

    void embaralha() {
        int vezes = 2000;
        while (vezes > 0) {
            int p1 = r.nextInt(qtdadeCartas());
            int p2 = r.nextInt(qtdadeCartas());
            Carta aux = cartas[p1];
            cartas[p1] = cartas[p2];
            cartas[p2] = aux;
            vezes--;
        }
    }
}
