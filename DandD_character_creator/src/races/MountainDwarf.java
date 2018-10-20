package races;

import Klassen.Klasse;

public class MountainDwarf extends Dwarf {

    //TODO Might add info about: Proficiency with light and medium armor

    public MountainDwarf(int[] orderedAbilityScores, Klasse emptyClass) {
        setStrength(orderedAbilityScores[0] + 2);
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

    @Override
    String getRace() {
        return "Mountain Dwarf";
    }
}
