package Exceptions;

public class DepositoInvalidoException extends Exception {
    
    public DepositoInvalidoException() {
        super();
    }

    public DepositoInvalidoException(String message) {
        super(message);
    }

    public DepositoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepositoInvalidoException(Throwable cause) {
        super(cause);
    }
}
