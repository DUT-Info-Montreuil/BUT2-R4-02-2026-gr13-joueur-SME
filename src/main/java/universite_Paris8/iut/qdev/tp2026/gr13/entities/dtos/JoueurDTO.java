package universite_Paris8.iut.qdev.tp2026.gr13.entities.dtos;

import universite_Paris8.iut.qdev.tp2026.gr13.entities.enums.LangueEnum;
import java.util.ArrayList;

public class JoueurDTO {
    private String prenom;
    private String pseudo;
    private Integer anneeNaissance;
    private ArrayList<String> centresInterets;
    private LangueEnum languePreferee;

    // Constructeur complet
    public JoueurDTO(String prenom, String pseudo, Integer anneeNaissance,
                     ArrayList<String> centresInterets, LangueEnum languePreferee) {
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.anneeNaissance = anneeNaissance;
        this.centresInterets = centresInterets;
        this.languePreferee = languePreferee;
    }

    // Getters & Setters
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Integer getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(Integer anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public ArrayList<String> getCentresInterets() {
        return centresInterets;
    }

    public void setCentresInterets(ArrayList<String> centresInterets) {
        this.centresInterets = centresInterets;
    }

    public LangueEnum getLanguePreferee() {
        return languePreferee;
    }

    public void setLanguePreferee(LangueEnum languePreferee) {
        this.languePreferee = languePreferee;
    }

    @Override
    public String toString() {
        return "JoueurDTO{" +
                "prenom='" + prenom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", anneeNaissance=" + anneeNaissance +
                ", centresInterets=" + centresInterets +
                ", languePreferee=" + languePreferee +
                '}';
    }
}