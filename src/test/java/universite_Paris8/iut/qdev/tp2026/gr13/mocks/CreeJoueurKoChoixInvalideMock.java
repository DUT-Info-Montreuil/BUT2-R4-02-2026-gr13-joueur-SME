package universite_Paris8.iut.qdev.tp2026.gr13.mocks;

import universite_Paris8.iut.qdev.tp2026.gr13.entities.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr13.interfaces.IservicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr13.utils.exceptions.InvalidChoiceException;

public class CreeJoueurKoChoixInvalideMock implements IservicesJoueur {

    @Override
    public JoueurDTO creeJoueur(String prenom, String pseudo, Integer anneeNaissance, String centresInterets, Integer codeLangue) throws InvalidChoiceException {
        throw new InvalidChoiceException();
    }
}