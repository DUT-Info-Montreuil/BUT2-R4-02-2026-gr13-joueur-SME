package universite_Paris8.iut.qdev.tp2026.gr13.entities.dtos;

import universite_Paris8.iut.qdev.tp2026.gr13.entities.enums.LangueEnum;

import java.util.ArrayList;
import java.util.Objects;

public class JoueurDTO {

    private String prenom;
    private String pseudo;
    private Integer anneeNaissance;
    private ArrayList<CentreInteret> centresInterets;
    private LangueEnum languePreferee;
    private int score;

    public JoueurDTO() {
        this.centresInterets = new ArrayList<>();
        this.score = 0;
    }

    public JoueurDTO(String prenom, String pseudo, Integer anneeNaissance, LangueEnum languePreferee) {
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.anneeNaissance = anneeNaissance;
        this.centresInterets = new ArrayList<>();
        this.languePreferee = languePreferee;
        this.score = 0;
    }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getPseudo() { return pseudo; }
    public void setPseudo(String pseudo) { this.pseudo = pseudo; }

    public Integer getAnneeNaissance() { return anneeNaissance; }
    public void setAnneeNaissance(Integer anneeNaissance) { this.anneeNaissance = anneeNaissance; }

    public ArrayList<CentreInteret> getCentresInterets() { return centresInterets; }
    public void setCentresInterets(ArrayList<CentreInteret> centresInterets) { this.centresInterets = centresInterets; }

    public LangueEnum getLanguePreferee() { return languePreferee; }
    public void setLanguePreferee(LangueEnum languePreferee) { this.languePreferee = languePreferee; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JoueurDTO joueur = (JoueurDTO) o;
        return Objects.equals(pseudo, joueur.pseudo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pseudo);
    }

    @Override
    public String toString() {
        return "JoueurDTO{" +
                "prenom='" + prenom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", anneeNaissance=" + anneeNaissance +
                ", centresInterets=" + centresInterets +
                ", languePreferee=" + languePreferee +
                ", score=" + score +
                '}';
    }
}