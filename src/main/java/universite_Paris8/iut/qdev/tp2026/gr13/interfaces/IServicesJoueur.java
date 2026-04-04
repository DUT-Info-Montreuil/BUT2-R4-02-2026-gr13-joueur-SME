package universite_Paris8.iut.qdev.tp2026.gr13.interfaces;
import universite_Paris8.iut.qdev.tp2026.gr13.entities.dtos.JoueurDTO;
import universite_Paris8.iut.qdev.tp2026.gr13.utils.exceptions.*;

import java.util.ArrayList;

public interface IServicesJoueur {

    JoueurDTO creeJoueur(String prenom,
                         String pseudo,
                         Integer anneeNaissance,
                         Integer codeLangue)
            throws DuplicatePseudoException,
            InvalidChoiceException,
            OutOfRangeException,
            InvalidFormatException,
            ValidationException;
}