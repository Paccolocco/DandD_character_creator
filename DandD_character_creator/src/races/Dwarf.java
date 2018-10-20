package races;

import Klassen.Klasse;

public abstract class Dwarf extends PlayerCharacter {

    /*
    Languages?: Common and Dwarvish
    Other Racial Traits?
    */
    public static PlayerCharacter Generate(int[] orderedAbilityScores, Klasse emptyClass){
        int subRaceChoice = -1;
        //TODO Implement a way to choose subRaceChoice
        if (subRaceChoice == 0){
            return new HillDwarf(orderedAbilityScores, emptyClass);
        }else{
            return new MountainDwarf(orderedAbilityScores, emptyClass);
        }
    }

    @Override
    int getSpeed() {
        return 25; //TODO Speed in feet? :/
    }

}
