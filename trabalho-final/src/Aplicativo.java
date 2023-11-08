import enumerators.SO;

public class Aplicativo {
    private int codigo;
    private String nome;
    private double valorLicenca;
    private SO so;
    
    public Aplicativo(int codigo, String nome, double valorLicenca, SO so) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorLicenca = valorLicenca;
        this.so = so;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValorLicenca() {
        return this.valorLicenca;
    }

    public SO getSo() {
        return this.so;
    }

    public String toLineFile(){
        return this.codigo + "," + this.nome + "," + this.valorLicenca + "," + this.so;
    }

    public static Aplicativo fromLineFile(String line){
        String[] tokens = line.split(",");
        int codigo = Integer.parseInt(tokens[0]);
        String nome = tokens[1];
        double preco = Double.parseDouble(tokens[2]);
        SO so = SO.valueOf(SO.class, tokens[3]);
        return new Aplicativo(codigo, nome, preco, so);
    }
}
