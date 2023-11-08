import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        GaragemLocomotiva.adicionarLocomotivasIniciais();
        GaragemVagao.adicionarVagoesIniciais();
        Patio patio = new Patio();

        Scanner in = new Scanner(System.in);
        boolean programaEncerrado = false;

        System.out.println("Bem vindo ao Sistema de Composição de Trens (2023)");

        while(!programaEncerrado) {
            Menu.exibir();
            
            int opcao = in.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("\t - Informe o ID do trem: ");
                    int idNovoTrem = in.nextInt();
                    System.out.print("\t - Informe o ID da locomotiva: ");
                    int idLocomotiva = in.nextInt();

                    Locomotiva locomotiva = GaragemLocomotiva.getLocomotiva(idLocomotiva);

                    if (patio.getTrem(idNovoTrem) == null) {
                        if (locomotiva != null) {
                            patio.adicionarTrem(idNovoTrem, locomotiva);
                            System.out.println("\n\tTrem cadastrado com sucesso.");
                        } else {
                            System.out.println("\n\tERRO: Locomotiva não encontrada.");
                        }
                    } else {
                        System.out.println("\n\tERRO: O ID informado já pertence a um trem");    
                    }

                    break;
                case 2:
                    System.out.print("\n\tEdição do trem: ");
                    System.out.print("\n\t - Informe o ID do trem: ");
                    int idTrem = in.nextInt();
                    Trem trem = patio.getTrem(idTrem);

                    if (trem != null) {
                        boolean edicaoDoTremEncerrada = false;
    
                        while(!edicaoDoTremEncerrada) {
                            MenuEdicaoTrem.exibir();
    
                            int opcaoEdicao = in.nextInt();
    
                            switch(opcaoEdicao) {
                                case 1:
                                    System.out.print("\t - Informe o ID da locomotiva: ");
                                    int idLocomotivaParaAdicionar = in.nextInt();
                                    Locomotiva locomotivaParaAdicionar = GaragemLocomotiva.getLocomotiva(idLocomotivaParaAdicionar);
                                    if (locomotivaParaAdicionar != null) {
                                        if (trem.adicionarLocomotiva(idLocomotivaParaAdicionar)) {
                                            locomotivaParaAdicionar.setTrem(trem);
                                            System.out.println("\n\tLocomotiva adicionada com sucesso.");
                                        } else {
                                            System.out.println("\n\tERRO: Erro ao adicionar locomotiva.");  
                                        }
                                    } else {
                                        System.out.println("\n\tERRO: Locomotiva não encontrada.");
                                    }

                                    break;
                                case 2:
                                    System.out.print("\t - Informe o ID do vagão: ");
                                    int idVagaoParaAdicionar = in.nextInt();
                                    Vagao vagaoParaAdicionar = GaragemVagao.getVagao(idVagaoParaAdicionar);
                                    if (vagaoParaAdicionar != null) {
                                        if (trem.adicionarVagao(idVagaoParaAdicionar)) {
                                            vagaoParaAdicionar.setTrem(trem);
                                            System.out.println("\n\tVagão adicionado com sucesso.");
                                        } else {
                                            System.out.println("\n\tERRO: Erro ao adicionar vagão.");  
                                        }
                                    } else {
                                        System.out.println("\n\tERRO: Vagão não encontrado.");
                                    }

                                    break;
                                case 3:
                                    if (trem.removerUltimoElemento()) {
                                        System.out.println("\n\tElemento removido.");
                                    } else {
                                        System.out.println("\n\tERRO: Nenhum elemento encontrado.");
                                    }
                                    break;
                                case 4:
                                    GaragemLocomotiva.exibirLocomotivasEstacionadas();
                                    break;
                                case 5:
                                    GaragemVagao.exibirVagoesEstacionados();
                                    break;
                                case 6:
                                    edicaoDoTremEncerrada = true;
                                    System.out.println("\n\tEdição do trem encerrada.");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("\n\tERRO: O trem informado não está estacionado no pátio.");
                    }

                    break;
                case 3:
                    if (patio.getQtdTrens() > 0) {
                        System.out.println("\n\tLista de trens estacionados no pátio:");
                        System.out.println(patio.toString());
                    } else {
                        System.out.println("\n\tNenhum trem está estacionado no pátio.");
                    }

                    break;
                case 4:
                    System.out.print("\t - Informe o ID do trem: ");
                    int idTremParaRemover = in.nextInt();
                    if (patio.removerTrem(idTremParaRemover)) {
                        System.out.println("\n\tTrem removido com sucesso.");
                    } else {
                        System.out.println("\n\tERRO: O trem informado não está estacionado no pátio.");
                    }
                    
                    break;
                case 5:
                    programaEncerrado = true;
                    System.out.println("\nPrograma encerrado. Obrigado por utilizar!");
                    break;
            }
        }

    }
}
