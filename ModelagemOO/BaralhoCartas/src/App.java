public class App {
    public static void main(String[] args) throws Exception {
        // Cria o baralho e embaralha
        Baralho baralho = new Baralho();
        baralho.embaralha();
        // Cria os decks dos jogadores
        Deck jogador1 = new Deck();
        Deck jogador2 = new Deck();
        // Distribui todas as cartas entre os dois jogadore
        while (!baralho.vazio()) {
            jogador1.insereEmbaixo(baralho.retiraDeCima());
            jogador2.insereEmbaixo(baralho.retiraDeCima());
        }
        // Loop do jogo
        boolean acabou = false;
        int rodada = 1;
        
        while (!acabou) {
            
            boolean empate = true;
            // Criar a mesa, aqui ficam os jogadores e as cartas jogadas
            Mesa mesa = new Mesa();
            System.out.println("Rodada: " + rodada);

            while (empate && !acabou) {
                // Pega uma carta de cada jogador
                Carta cj1 = jogador1.retiraDeCima();
                Carta cj2 = jogador2.retiraDeCima();
    
                mesa.insereEmbaixo(cj1);
                mesa.insereEmbaixo(cj2);
                mesa.embaralha();
    
                System.out.println("Carta do jogador 1: " + cj1.toString());
                System.out.println("Carta do jogador 2: " + cj2.toString());
    
                // Se a carta do jogador1 é maior, ele fica com todas
                if (cj1.eMaior(cj2)) {
                    jogador1.insereVariasEmbaixo(mesa.retiraTodas());
                    System.out.println("Jogador 1 ganhou a rodada");
                    empate = false;
                } else if (cj2.eMaior(cj1))  {
                    jogador2.insereVariasEmbaixo(mesa.retiraTodas());
                    System.out.println("Jogador 2 ganhou a rodada");
                    empate = false;
                } else {
                    System.out.println("Empate");
                }
                
                // Verifica se acabou
                if (jogador1.vazio() || jogador2.vazio()) {
                    acabou = true;
                }
            }

            // Incrementa a rodada
            rodada++;
        }
        System.out.println("Fim");
    }
}
