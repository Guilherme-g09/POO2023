import Exceptions.DepositoInvalidoException;
import Exceptions.SaldoInicialInvalidoException;
import Exceptions.SaqueInvalidoException;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldoInicial) throws SaldoInicialInvalidoException {
        if (saldoInicial <= 0.0) {
            throw new SaldoInicialInvalidoException("O saldo incial precisa ser maior que zero.");
        }
        saldo = saldoInicial;
    }

    public void deposito(double valor) throws DepositoInvalidoException {
        if (valor <= 0.0) {
            throw new DepositoInvalidoException("O valor do depósito precisa ser superior a zero.");
        }
        saldo += valor;
    }

    public void retirada(double valor) throws SaqueInvalidoException {
        if (valor <= 0.0) {
            throw new SaqueInvalidoException("O valor do saque precisa ser superior a zero.");
        }

        if (valor > saldo) {
            throw new RuntimeException("Retirada maior que o saldo disponível.");
        }

        saldo -= valor;
    }

    public double getSaldo() {
        return(saldo);
    }

}
