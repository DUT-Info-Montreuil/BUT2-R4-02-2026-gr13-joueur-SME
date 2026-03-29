package universite_Paris8.iut.qdev.tp2026.gr13.utils.exceptions;

public class DuplicatePseudoException extends Exception {

    public DuplicatePseudoException() {
        super("Ce pseudo est déjà utilisé par un autre joueur.");
    }

    public DuplicatePseudoException(String pseudo) {
        super("Le pseudo \"" + pseudo + "\" est déjà pris.");
    }

    public DuplicatePseudoException(String pseudo, Throwable cause) {
        super("Le pseudo \"" + pseudo + "\" est déjà pris.", cause);
    }
}