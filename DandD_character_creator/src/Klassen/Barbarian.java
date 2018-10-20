package Klassen;

public class Barbarian extends Klasse {

    //Final Variables of a Barbarian
    private final String name = "Barbarian";
    private final int hitDice = 12;





    @Override
    public String getName() {
        return name;
    }

    //Getters and Setters

    public int getHitDice() {
        return hitDice;
    }
}
