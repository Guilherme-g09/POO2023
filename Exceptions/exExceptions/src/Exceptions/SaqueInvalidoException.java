package Exceptions;

public class SaqueInvalidoException extends Exception {
    
    public SaqueInvalidoException() {
        super();
    }

    public SaqueInvalidoException(String message) {
        super(message);
    }

    public SaqueInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public SaqueInvalidoException(Throwable cause) {
        super(cause);
    }
}
