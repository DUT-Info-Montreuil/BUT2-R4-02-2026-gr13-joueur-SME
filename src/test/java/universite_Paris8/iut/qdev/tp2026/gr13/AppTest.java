package universite_Paris8.iut.qdev.tp2026.gr13;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import universite_Paris8.iut.qdev.tp2026.gr13.interfaces.IservicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr13.mocks.*;
import universite_Paris8.iut.qdev.tp2026.gr13.utils.exceptions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void TestNomInvalid(){
        IservicesJoueur iservicesJoueur = new CreeJoueurKoNomInvalideMock();
        assertThrows(InvalidFormatException.class, () ->
                iservicesJoueur.creeJoueur("111", "gg", 2000, "Football", 1));
    }

    @Test
    public void TestPseudoExistant() {
        IservicesJoueur iservicesJoueur = new CreeJoueurKoPseudoExistantMock();
        assertThrows(DuplicatePseudoException.class, () ->
                iservicesJoueur.creeJoueur("Jean", "Gamer123", 2000, "Jeux", 1));
    }

    @Test
    public void TestChoixInvalide() {
        IservicesJoueur iservicesJoueur = new CreeJoueurKoChoixInvalideMock();
        assertThrows(InvalidChoiceException.class, () ->
                iservicesJoueur.creeJoueur("Jean", "gg", 2000, "Football", 6));
    }

    @Test
    public void TestValeurHorsLimite() {
        IservicesJoueur iservicesJoueur = new CreeJoueurKoHorsLimiteMock();
        assertThrows(OutOfRangeException.class, () ->
                iservicesJoueur.creeJoueur("Jean", "gg", 1800, "Football", 1));
    }

    @Test
    public void TestValidationGlobaleEchouee() {
        IservicesJoueur iservicesJoueur = new CreeJoueurKoValidationGlobaleMock();
        assertThrows(ValidationException.class, () ->
                iservicesJoueur.creeJoueur(null, "gg", 2000, "Football", 1));
    }

    @Test
    public void TestInteretInvalid() {
        // Utilisation du nouveau mock spécifique aux centres d'intérêt
        IservicesJoueur iservicesJoueur = new CreeJoueurKoInteretInvalideMock();

        // On teste une saisie invalide finissant par une virgule
        assertThrows(InteretFormatException.class, () ->
                iservicesJoueur.creeJoueur("Jean", "Gamer", 2000, "Football,", 1));
    }
}
