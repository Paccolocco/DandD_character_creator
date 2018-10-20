package resources;


import Klassen.Barbarian;
import UserInterface.GUIDandDUserInterface;
import races.Dwarf;
import races.PlayerCharacter;

public class Controller {
    public static void main(String[] args) {
       // Introduction.Menu();
        //System.out.println("XXX");
        int[] array = {1,2,3,4,5,6};
        PlayerCharacter player = Dwarf.Generate(array, new Barbarian());
        GUIDandDUserInterface.main(args);
        player.getSpeed();
    }
}
