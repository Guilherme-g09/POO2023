public class ContaComum {
    private int numero;
    private int saldo;

    public ContaComum(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public boolean deposito(int valor) {
        this.saldo += valor;
        return true;
    }

    public boolean retirada(int valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
