package races;

import Klassen.Klasse;

public class Dwarf extends PlayerCharacter {

    private final int speed = 25; //TODO Speed in feet? :/
    /*
    Languages?: Common and Dwarvish
    Other Racial Traits?
    */
    private Klasse klasse;

    public Dwarf(int[] orderedAbilityScores, int classNo){
        //TODO Implement this Constructor!!!
    }

    /* TODO do we want Dwarf to be a playable Race? Or just the subraces?
    * If only subraces should be playable, then make this class abstract and remove this and following Methods.
    */
    @Override
    String getRace() {
        return "Dwarf";
    }

    @Override
    String getKlasse() {
        return klasse.getName();
    }
}
