package universite_Paris8.iut.qdev.tp2026.gr13.utils.exceptions;

public class InvalidChoiceException extends Exception {

    public InvalidChoiceException() {
        super("Le choix fourni est invalide.");
    }

    public InvalidChoiceException(String detail) {
        super("Choix invalide : " + detail);
    }

    public InvalidChoiceException(String detail, Throwable cause) {
        super("Choix invalide : " + detail, cause);
    }
}