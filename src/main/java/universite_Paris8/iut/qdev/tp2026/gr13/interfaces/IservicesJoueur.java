package universite_Paris8.iut.qdev.tp2026.gr13.interfaces;

import universite_Paris8.iut.qdev.tp2026.gr13.entities.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr13.utils.exceptions.*;

import java.util.ArrayList;

public interface IservicesJoueur {

    /**
     * Crée un nouveau joueur dans le système.
     *
     * @param prenom         le prénom du joueur
     * @param pseudo         le pseudo du joueur (doit être unique)
     * @param anneeNaissance l'année de naissance du joueur
     * @param codeLangue     le code de la langue préférée (cf. LangueEnum)
     *
     * @throws DuplicatePseudoException si le pseudo est déjà utilisé
     * @throws InvalidChoiceException   si le codeLangue est inconnu
     * @throws OutOfRangeException      si l'anneeNaissance est hors plage
     * @throws InvalidFormatException   si le format du prénom est incorrect
     * @throws ValidationException      si la validation globale échoue
     */
    JoueurDTO creeJoueur(String prenom,
                         String pseudo,
                         Integer anneeNaissance,
                         Integer codeLangue)
            throws DuplicatePseudoException,
            InvalidChoiceException,
            OutOfRangeException,
            InvalidFormatException,
            ValidationException;

    /**
     * Retourne la liste de tous les joueurs enregistrés.
     *
     * @return la liste des joueurs
     * @throws ValidationException si aucun joueur n'est présent
     */
    ArrayList<JoueurDTO> recupererListeJoueurs() throws ValidationException;
}