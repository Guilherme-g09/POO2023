public class Baralho {
    private Deck deck;

    public Baralho() {
        deck = new Deck();
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                Carta carta = new Carta(naipe, valor);
                deck.insereEmbaixo(carta);
            }
        }
    }

    public int qtdadeCartas() {
        return deck.qtdadeCartas();
    }

    public boolean vazio() {
        return deck.vazio();
    }

    public Carta retiraDeCima() {
        return deck.retiraDeCima();
    }

    public void embaralha() {
        deck.embaralha();
    }
}
