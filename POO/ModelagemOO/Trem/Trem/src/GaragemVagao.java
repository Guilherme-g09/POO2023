import java.util.ArrayList;

public class GaragemVagao {
    private static ArrayList<Vagao> vagoes = new ArrayList<Vagao>();
    public static int qtdVagoes = 0;

    public static ArrayList<Vagao> getVagoes() {
        return vagoes;
    }

    public static Vagao getVagao(int idVagao) {
        return vagoes.stream().filter(vag -> vag.getId() == idVagao).findFirst().orElse(null);
    }

    public static void adicionarVagoesIniciais() {
        String[] linhas = Biblioteca.readFile("vagoes.txt");

        for (String linha : linhas) {
            int pesoMax = Integer.parseInt(linha);

            Vagao vagao = new Vagao(pesoMax);
            estacionarVagao(vagao);
        }
    }

    public static void estacionarVagao(Vagao vagao) {
        vagoes.add(vagao);
        qtdVagoes++;
    }

    public static Vagao removerVagao(Vagao vagao) {
        if (vagao != null) {
            vagoes.remove(vagao);
            qtdVagoes--;
        }
        
        return vagao;
    }

    public static void exibirVagoesEstacionados() {
        System.out.println("\tLista de vagões na garagem:");
        for (Vagao vagao : vagoes) {
            System.out.println("\t" + vagao.getId() + " - " + vagao.toString() + "- Capacidade Máxima: " + vagao.getCapMaxCarga());
        }
    }
}
