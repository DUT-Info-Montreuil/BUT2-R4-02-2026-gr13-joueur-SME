package universite_Paris8.iut.qdev.tp2026.gr13.entities.enums;

public enum LangueEnum {
    FRANCAIS(1, "Français"),
    ANGLAIS(2, "Anglais"),
    ESPAGNOL(3, "Espagnol"),
    ALLEMAND(4, "Allemand"),
    ITALIEN(5, "Italien");

    private final int code;
    private final String libelle;

    LangueEnum(int code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public int getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    /**
     * Retrouve une langue à partir de son code entier.
     *
     * @param code le code numérique de la langue
     * @return le LangueEnum correspondant
     * @throws IllegalArgumentException si le code ne correspond à aucune langue
     */
    public static LangueEnum fromCode(int code) {
        for (LangueEnum langue : values()) {
            if (langue.code == code) {
                return langue;
            }
        }
        throw new IllegalArgumentException("Code de langue inconnu : " + code);
    }

    @Override
    public String toString() {
        return libelle + " (" + code + ")";
    }
}
