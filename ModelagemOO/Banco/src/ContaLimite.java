public class ContaLimite extends ContaComum {
    private int limite;

    public ContaLimite(int numero) {
        super(numero);
    }

    @Override
    public boolean retirada(int valor) {
        int saldo = this.getSaldo();
        if (valor <= saldo + this.limite) {
            saldo -= valor;
            return true;
        }
        return false;
    }   
}
