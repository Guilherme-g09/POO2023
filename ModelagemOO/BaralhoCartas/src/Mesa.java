public class Mesa {
    private Deck deck;

    public Mesa() {
        this.deck = new Deck();
    }

    public void insereEmbaixo(Carta carta) {
        deck.insereEmbaixo(carta);
    }

    public Carta[] retiraTodas() {
        return deck.retiraTodas();
    }

    public void embaralha() {
        deck.embaralha();
    }
}
