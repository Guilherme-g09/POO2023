public class Produto {
    private String codigo;
    private String descricao;
    private Double precoFabrica;

    public Produto(String codigo, String descricao, Double precoFabrica) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoFabrica = precoFabrica;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPrecoFabrica() {
        return precoFabrica;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", precoFabrica=" + precoFabrica + "]";
    }
}