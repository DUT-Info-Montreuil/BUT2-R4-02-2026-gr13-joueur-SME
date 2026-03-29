package universite_Paris8.iut.qdev.tp2026.gr13.utils.exceptions;

public class OutOfRangeException extends Exception {

    public OutOfRangeException() {
        super("La valeur est hors de la plage autorisée.");
    }

    public OutOfRangeException(String champ) {
        super("Valeur hors plage pour : " + champ);
    }

    public OutOfRangeException(String champ, int valeur) {
        super("La valeur " + valeur + " est hors plage pour : " + champ);
    }

    public OutOfRangeException(String champ, Throwable cause) {
        super("Valeur hors plage pour : " + champ, cause);
    }
}