package universite_Paris8.iut.qdev.tp2026.gr13.impl

import universite_Paris8.iut.qdev.tp2026.gr13.entities.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr13.entities.enums.LangueEnum;
import universite_Paris8.iut.qdev.tp2026.gr13.interfaces.IServicesJoueur;
import universite_Paris8.iut.qdev.tp2026.gr13.utils.exceptions.*;

import java.time.Year;
import java.util.ArrayList;

public class ServicesJoueurImpl implements IServicesJoueur {

    private final ArrayList<JoueurDTO> joueurs = new ArrayList<>();

    @Override
    public JoueurDTO creeJoueur(String prenom,
                                String pseudo,
                                Integer anneeNaissance,
                                Integer codeLangue)
            throws DuplicatePseudoException,
            InvalidChoiceException,
            OutOfRangeException,
            InvalidFormatException,
            ValidationException {

        if (prenom == null || pseudo == null || anneeNaissance == null || codeLangue == null) {
            throw new ValidationException("Tous les champs sont obligatoires.");
        }

        for (JoueurDTO j : joueurs) {
            if (j.getPseudo().equalsIgnoreCase(pseudo)) {
                throw new DuplicatePseudoException(pseudo);
            }
        }

        if (prenom.length() < 2 || prenom.length() > 150) {
            throw new InvalidFormatException("prenom", "doit contenir entre 2 et 150 caractères");
        }

        int anneeActuelle = Year.now().getValue();
        if (anneeNaissance > anneeActuelle || anneeNaissance < anneeActuelle - 150) {
            throw new OutOfRangeException("anneeNaissance", anneeNaissance);
        }

        LangueEnum langue;
        try {
            langue = LangueEnum.fromCode(codeLangue);
        } catch (IllegalArgumentException e) {
            throw new InvalidChoiceException("code langue inconnu : " + codeLangue);
        }

        JoueurDTO joueur = new JoueurDTO(prenom, pseudo, anneeNaissance, langue);
        joueurs.add(joueur);
        return joueur;
    }

    @Override
    public ArrayList<JoueurDTO> recupererListeJoueurs() throws ValidationException {
        if (joueurs.isEmpty()) {
            throw new ValidationException("Aucun joueur enregistré pour le moment.");
        }
        return joueurs;
    }
}