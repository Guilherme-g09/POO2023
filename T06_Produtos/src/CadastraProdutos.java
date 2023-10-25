import java.util.LinkedList;
import java.util.List;

public class CadastraProdutos {
    private List<Produto> produtos;
    
    public CadastraProdutos() {
        this.produtos = new LinkedList<>();

        this.produtos.add(new Produto("1", "Mesa", 2000.0));
        this.produtos.add(new Produto("2", "Cadeira", 3000.0));
        this.produtos.add(new Produto("3", "Monitor", 4000.0));
        this.produtos.add(new Produto("4", "Geladeira", 5000.0));
    }

    
}
