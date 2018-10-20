package races;

import Klassen.Klasse;

public abstract class PlayerCharacter extends Character {

    private Klasse klasse;

    //protected abstract void generateMaxHitPoints();
    //protected abstract void updateMaxHitPoints();
    //Still in Development!
    public abstract String getRace();

    //Getters and Setters
    void setKlasse(Klasse klasse) {
        this.klasse = klasse;
    }

    public Klasse getKlasse() {
        return klasse;
    }
}
