import java.io.IOException;

import Exceptions.DepositoInvalidoException;
import Exceptions.SaldoInicialInvalidoException;
import Exceptions.SaqueInvalidoException;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercício número 2
        try {
            double saldoInicial = 0.0;
            ContaCorrente conta = new ContaCorrente(saldoInicial);

            // Depósito válido
            conta.deposito(500);

            // Deposito com valor negativo
            conta.deposito(-200); // DepositoInvalidoException

            // Saque válida
            conta.retirada(300);

            // Saque com valor negativo
            conta.retirada(-100); // RetiradaInvalidaException

            // Saque maior que o saldo disponível
            conta.retirada(1000); // RuntimeException

        } catch (SaldoInicialInvalidoException e) {
            System.out.println("Erro ao criar a conta: " + e);
        } catch (DepositoInvalidoException e) {
            System.out.println("Erro ao realizar o depósito: " + e);
        } catch (SaqueInvalidoException e) {
            System.out.println("Erro ao realizar saque: " + e);
        } catch (Exception e) {
            System.err.println("Erro ao realizar saque: " + e);
        }

        // Exercício 3

        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro: " + e);
        }

        try {
            int[] vet = new int[5];
            int valor = vet[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erro: " + e);
        }

        // Exercício 10
        try {
            String endereco = "http://java.sun.com//index.html";
            WebPageReader reader = new WebPageReader(endereco);

            boolean done = false;
            while(!done) {
                String input = reader.readLine();
                if (input == null) {
                    done = true;
                } 
                else {
                    System.out.print(input);
                } 
            }
        } catch (IOException e) {
            System.out.print(e);
        }
    }
}
