package races;

import Klassen.Klasse;

public class Dragonborn extends PlayerCharacter {

    private Dragonborn(int[] orderedAbilityScores, Klasse emptyClass) {
        setStrength(orderedAbilityScores[0]);
        setDexterity(orderedAbilityScores[1]);
        setConstitution(orderedAbilityScores[2]);
        setIntelligence(orderedAbilityScores[3]);
        setWisdom(orderedAbilityScores[4]);
        setCharisma(orderedAbilityScores[5]);
        //TODO Implement the choosing of a name!
        setName("Some generic Name");
        setKlasse(emptyClass);
        setMaxHitPoints(getKlasse().getHitDice() + ((int) Math.floor((double) (getConstitution()-10)/2)));
    }

    public static PlayerCharacter Generate(int[] orderedAbilityScores, Klasse emptyClass){
        //Add Dragonborn Bonus (+2 Str, +1 Charisma)
        orderedAbilityScores[0] = orderedAbilityScores[0] + 2;
        orderedAbilityScores[5] = orderedAbilityScores[5] + 1;
        //TODO Implement a way to choose subRaceChoice
        return new Dragonborn(orderedAbilityScores, emptyClass);
    }


    @Override
    public String getRace() {
        return "Dragonborn";
    }

    @Override
    public int getSpeed() {
        return 30;
    }
}
