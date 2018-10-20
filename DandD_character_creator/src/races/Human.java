package races;

import Klassen.Klasse;

public class Human extends PlayerCharacter {

    public Human(int[] orderedAbilityScores, Klasse emptyClass) {
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
        //Add Human Bonus (+1 each)
        for (int i = 0; i<orderedAbilityScores.length; i++){
            orderedAbilityScores[i] = orderedAbilityScores[i] + 1;
        }
        return new Human(orderedAbilityScores, emptyClass);
    }

    @Override
    public String getRace() {
        return "Human";
    }

    @Override
    public int getSpeed() {
        return 30; //TODO Speed in feet? :/
    }
}
