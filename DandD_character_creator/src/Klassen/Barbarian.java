package Klassen;

public class Barbarian extends Klasse {

    //Final Variables of a Barbarian
    final String name = "Barbarian";
    final int hitDice = 12;

    //Non-final Variables of a Barbarian
    int experience = 0;     //TODO Not yet implemented
    int numHitDie = -1;     //TODO Not yet implemented
    int proficiencyModifier = -1; //TODO Not yet implemented


    @Override
    public String getName() {
        return name;
    }
}
