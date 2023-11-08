package Exceptions;

public class SaldoInicialInvalidoException extends Exception {
    
    public SaldoInicialInvalidoException() {
        super();
    }

    public SaldoInicialInvalidoException(String message) {
        super(message);
    }

    public SaldoInicialInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public SaldoInicialInvalidoException(Throwable cause) {
        super(cause);
    }
}
