package universite_Paris8.iut.qdev.tp2026.gr13.utils.exceptions;

public class InvalidFormatException extends Exception {

    public InvalidFormatException() {
        super("Le format du champ est incorrect.");
    }

    public InvalidFormatException(String champ) {
        super("Format incorrect pour le champ : " + champ);
    }

    public InvalidFormatException(String champ, String raison) {
        super("Champ \"" + champ + "\" invalide : " + raison);
    }

    public InvalidFormatException(String champ, Throwable cause) {
        super("Format incorrect pour le champ : " + champ, cause);
    }
}