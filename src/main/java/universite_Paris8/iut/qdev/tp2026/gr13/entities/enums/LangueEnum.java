package universite_Paris8.iut.qdev.tp2026.gr13.entities.enums;

public enum LangueEnum {

    FRANCAIS(1, "fr", "Français"),
    ANGLAIS(2, "en", "Anglais"),
    ESPAGNOL(3, "es", "Espagnol"),
    ALLEMAND(4, "de", "Allemand"),
    ITALIEN(5, "it", "Italien");

    private final int code;
    private final String libelleCourt;
    private final String libelle;

    LangueEnum(int code, String libelleCourt, String libelle) {
        this.code = code;
        this.libelleCourt = libelleCourt;
        this.libelle = libelle;
    }

    public int getCode() { return code; }
    public String getLibelleCourt() { return libelleCourt; }
    public String getLibelle() { return libelle; }

    public static LangueEnum fromCode(int code) {
        for (LangueEnum langue : values()) {
            if (langue.code == code) return langue;
        }
        throw new IllegalArgumentException("Code de langue inconnu : " + code);
    }

    @Override
    public String toString() {
        return libelle + " (" + libelleCourt + ")";
    }
}