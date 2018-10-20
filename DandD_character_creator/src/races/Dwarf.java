package races;

import Klassen.Klasse;

public abstract class Dwarf extends PlayerCharacter {

    /*
    Languages?: Common and Dwarvish
    Other Racial Traits?
    */
    public static PlayerCharacter Generate(int[] orderedAbilityScores, Klasse emptyClass){
        //Add Dwarf Bonus (+2 Con)
        orderedAbilityScores[2] = orderedAbilityScores[2] + 2;
        int subRaceChoice = -1;
        //TODO Implement a way to choose subRaceChoice
        if (subRaceChoice == 0){
            return new DwarfHill(orderedAbilityScores, emptyClass);
        }else{
            return new DwarfMountain(orderedAbilityScores, emptyClass);
        }
    }

    @Override
    public int getSpeed() {
        return 25; //TODO Speed in feet? :/
    }

}
