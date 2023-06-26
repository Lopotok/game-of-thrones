public enum House {

    STARK("Winter is coming", "Közeleg a tél", "wolf"),
    LANNISTER("Hear Me Roar", "Halld üvöltésem", "lion"),
    TARGARYEN("Fire and Blood","Tűz és vér", "dragon"),
    BARATHEON( "Ours is the Fury", "Miénk a harag", "stag"),
    GREYJOY("We Do Not Sow","Mi nem vetünk","kraken"),
    TYRELL("Growing Strong", "Erőssé növünk","rose");


    public final String englishName;

    public final String hungarianName;

    private final String sigil;

    House(String englishName, String hungarianName, String sigil) {
        this.englishName = englishName;
        this.hungarianName = hungarianName;
        this.sigil = sigil;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getHungarianName() {
        return hungarianName;
    }

    public String getSigil() {
        return sigil;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
