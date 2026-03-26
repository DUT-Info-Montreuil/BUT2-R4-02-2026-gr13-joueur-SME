package universite_Paris8.iut.qdev.tp2026.gr13.interfaces;

import universite_Paris8.iut.qdev.tp2026.gr13.entities.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr13.utils.exceptions.*;

public interface IservicesJoueur {
    /**
     * Crée un nouveau joueur dans le système.
     *
     * @param prenom          le prénom du joueur
     * @param pseudo          le pseudo du joueur (doit être unique)
     * @param anneeNaissance  l'année de naissance du joueur
     * @param centresInterets les centres d'intérêts du joueur
     * @param codeLangue      le code de la langue préférée (cf. LangueEnum)
     *
     * @throws DuplicatePseudoException si le pseudo est déjà utilisé par un autre joueur
     * @throws InvalidChoiceException   si un paramètre à choix multiples est invalide (ex: codeLangue inconnu)
     * @throws OutOfRangeException      si une valeur numérique est hors de la plage autorisée (ex: anneeNaissance)
     * @throws InvalidFormatException   si le format d'un champ est incorrect (ex: pseudo contient des caractères interdits)
     * @throws ValidationException      si la validation globale du joueur échoue (champs obligatoires manquants, etc.)
     */
    public JoueurDTO creeJoueur(String prenom, String pseudo, Integer anneeNaissance, String centresInterets, Integer codeLangue)
            throws DuplicatePseudoException,
            InvalidChoiceException,
            OutOfRangeException,
            InvalidFormatException,
            ValidationException, InteretFormatException;
}
