public enum Menu {
    CRIAR_TREM (1, "Criar um novo trem"),
    EDITAR_TREM (2, "Editar um trem"),
    LISTAR_TRENS (3, "Listar todos os trens cadastrados"),
    DESFAZER_TREM (4, "Desfazer um trem"),
    ENCERRAR_PROGRAMA (5, "Encerrar programa");

    private int num;
    private String descricao;

    private Menu(int num, String descricao) {
        this.num = num;
        this.descricao = descricao;
    }

    public int getNum() {
        return this.num;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static void exibir() {
        System.out.println("\n--------------- Menu principal ---------------\n");
        System.out.println("Escolha uma opção do menu para continuar:");

        for (Menu topico : Menu.values()) {
            System.out.println("\t" + topico.getNum() + " - " + topico.getDescricao());
        }

        System.out.print("Opção: ");

    }
}
