package races;

import Klassen.Klasse;

public class HalflingLightfoot extends Halfling {


    public HalflingLightfoot(int[] orderedAbilityScores, Klasse emptyClass) {
        setStrength(orderedAbilityScores[0]);
        setDexterity(orderedAbilityScores[1]);
        setConstitution(orderedAbilityScores[2]);
        setIntelligence(orderedAbilityScores[3]);
        setWisdom(orderedAbilityScores[4]);
        setCharisma(orderedAbilityScores[5] + 1);
        //TODO Implement the choosing of a name!
        setName("Some generic Name");
        setKlasse(emptyClass);
        setMaxHitPoints(getKlasse().getHitDice() + ((int) Math.floor((double) (getConstitution()-10)/2)));
    }

    @Override
    public String getRace() {
        return "Halfling/Lightfoot";
    }
}
