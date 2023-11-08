public enum MenuEdicaoTrem {
    INSERIR_LOCOMOTIVA (1, "Inserir uma locomotiva"),
    INSERIR_VAGAO (2, "Inserir um vagao"),
    REMOVER_ULTIMO_ELEMENTO (3, "Remover último elemento do trem"),
    LISTAR_LOCOMOTIVAS_LIVRES (4, "Listar locomotivas livres (pátio)"),
    LISTAR_VAGOES_LIVRES (5, "Listar vagões livres (pátio)"),
    ENCERRAR_EDICAO_TREM (6, "Encerrar edição do trem");

    private int num;
    private String descricao;

    private MenuEdicaoTrem(int num, String descricao) {
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
        System.out.println("\n----------- Menu de edição de trem -----------\n");
        System.out.println("Escolha uma opção do menu para continuar:");

        for (MenuEdicaoTrem topico : MenuEdicaoTrem.values()) {
            System.out.println("\t" + topico.getNum() + " - " + topico.getDescricao());
        }

        System.out.print("Opção: ");

    }
}
