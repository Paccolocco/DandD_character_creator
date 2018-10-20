package races;

import Klassen.Klasse;

public abstract class Gnome extends PlayerCharacter {

    public static PlayerCharacter Generate(int[] orderedAbilityScores, Klasse emptyClass){
        //Add Gnome Bonus (+2 Int)
        orderedAbilityScores[3] = orderedAbilityScores[3] + 2;
        int subRaceChoice = -1;
        //TODO Implement a way to choose subRaceChoice
        if (subRaceChoice == 0){
            return new GnomeForest(orderedAbilityScores, emptyClass);
        }else{
            return new GnomeRock(orderedAbilityScores, emptyClass);
        }
    }

    @Override
    public int getSpeed() {
        return 25;
    }
}
