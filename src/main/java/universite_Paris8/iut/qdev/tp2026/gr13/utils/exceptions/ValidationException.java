package universite_Paris8.iut.qdev.tp2026.gr13.utils.exceptions;

public class ValidationException extends Exception {

    public ValidationException() {
        super("La validation du joueur a échoué.");
    }

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}