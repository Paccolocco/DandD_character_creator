package resources;

import java.util.Scanner;

public class Introduction {

    /**
     * Functions as the Main Menu of the Program
     */
    public static void Menu(){
        Scanner sc = new Scanner(System.in);
        //Asking for the desired function.
        System.out.println("Welcome to the D&D character creator \n" +
                "1.\tCreate new character \n2.\tLoad already existing chracter \n3.\tExit program");
        System.out.print("Type here: ");
        MainLoop:
        while(true) {
            // Determining what the user selected.
            switch (sc.nextInt()) {
                case 1:
                    CreateCharacter.ChooseRace();
                    break;
                case 2:
                    //TODO LoadCharacter...
                    break;
                case 3:
                    break MainLoop;
                default:
                    System.out.println("Wrong Input! Try again.");
                    break;
            }
            System.out.println("Please choose an option: \n" +
                    "1.\tCreate new character \n2.\tLoad already existing chracter \n3.\tExit program" +
                    "Type here: ");
        }
    }
}
