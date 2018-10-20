package races;

import Klassen.Klasse;

public class GnomeRock extends Gnome {


    GnomeRock(int[] orderedAbilityScores, Klasse emptyClass) {
        setStrength(orderedAbilityScores[0]);
        setDexterity(orderedAbilityScores[1]);
        setConstitution(orderedAbilityScores[2] + 1);
        setIntelligence(orderedAbilityScores[3]);
        setWisdom(orderedAbilityScores[4]);
        setCharisma(orderedAbilityScores[5]);
        //TODO Implement the choosing of a name!
        setName("Some generic Name");
        setKlasse(emptyClass);
        setMaxHitPoints(getKlasse().getHitDice() + ((int) Math.floor((double) (getConstitution()-10)/2)));
    }

    @Override
    public String getRace() {
        return "Rock Gnome";
    }
}
