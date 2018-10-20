package races;

import Klassen.Klasse;

public abstract class Elf extends PlayerCharacter {

    public static PlayerCharacter Generate(int[] orderedAbilityScores, Klasse emptyClass){
        //Add Elf Bonus (+2 Dex)
        orderedAbilityScores[1] = orderedAbilityScores[1] + 2;
        int subRaceChoice = -1;
        //TODO Implement a way to choose subRaceChoice
        if (subRaceChoice == 0){
            return new ElfHigh(orderedAbilityScores, emptyClass);
        }else if (subRaceChoice == 1){
            return new ElfWood(orderedAbilityScores, emptyClass);
        }else{
            return new ElfDark(orderedAbilityScores, emptyClass);
        }
    }

    @Override
    public int getSpeed() {
        return 30; //TODO Speed in feet? :/
    }

}
