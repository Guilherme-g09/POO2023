import java.util.ArrayList;

public class GaragemLocomotiva {
    private static ArrayList<Locomotiva> locomotivas = new ArrayList<Locomotiva>();
    public static int qtdLocomotivas = 0;

    public static ArrayList<Locomotiva> getLocomotivas() {
        return locomotivas;
    }

    public static Locomotiva getLocomotiva(int idLocomotiva) {
        return locomotivas.stream().filter(loc -> loc.getId() == idLocomotiva).findFirst().orElse(null);
    }

    public static void adicionarLocomotivasIniciais() {
        String[] linhas = Biblioteca.readFile("locomotivas.txt");

        for (String linha : linhas) {
            String[] valores = linha.split(",");

            int pesoMax = Integer.parseInt(valores[0]);
            int numMaxVagoes = Integer.parseInt(valores[1]);

            Locomotiva locomotiva = new Locomotiva(pesoMax, numMaxVagoes);
            estacionarLocomotiva(locomotiva);
        }
    }

    public static void estacionarLocomotiva(Locomotiva locomotiva) {
        locomotivas.add(locomotiva);
        qtdLocomotivas++;
    }

    public static Locomotiva removerLocomotiva(Locomotiva locomotiva) {
        if (locomotiva != null) {
            locomotivas.remove(locomotiva);
            qtdLocomotivas--;
        }
        
        return locomotiva;
    }

    public static void exibirLocomotivasEstacionadas() {
        System.out.println("\tLista de locomotivas na garagem:");
        for (Locomotiva locomotiva : locomotivas) {
            System.out.println("\t" + locomotiva.getId() + " - " + locomotiva.toString() + "- Peso: " + locomotiva.getPesoMax() + " | Vagões: " + locomotiva.getNumMaxVagoes());
        }
    }
}
