package races;

import Klassen.Klasse;

public abstract class Halfling extends PlayerCharacter {

    public static PlayerCharacter Generate(int[] orderedAbilityScores, Klasse emptyClass){
        //Add Halfling Bonus (+2 Dex)
        orderedAbilityScores[1] = orderedAbilityScores[1] + 2;
        int subRaceChoice = -1;
        //TODO Implement a way to choose subRaceChoice
        if (subRaceChoice == 0){
            return new HalflingLightfoot(orderedAbilityScores, emptyClass);
        }else{
            return new HalflingStout(orderedAbilityScores, emptyClass);
        }
    }

    @Override
    int getSpeed() {
        return 25; //TODO Speed in feet? :/
    }
}
