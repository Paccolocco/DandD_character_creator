package resources;

import java.util.Scanner;

public class CreateCharacter {

    /**
     * Prompts the user to choose a race and gives information about them.
     */
    public static void ChooseRace(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter true/false to toggle information texts.");
        boolean toggleinfotext;
        //Ask if use wants to see Info texts.
        try {
            toggleinfotext = sc.nextBoolean();
        }catch (Exception e){
            toggleinfotext = true;
        }


        //Print infotext, if requested.
        if(toggleinfotext){
            System.out.println("To start of your new character at fist you have to choose a race.\n" +
                    "The most common races are humans, elves, halflings and dwarfes.\n" +
                    "Some races also have subraces like wood elves or mountain dwarfes.\n" +
                    "There's also the more exceptional races like gnomes, half-elves, tieflings and dragonborns.");
            System.out.println();
        }


        //Show race selection
        System.out.println("Enter the corresponding number to see more information about a specific race.\n " +
                "To choose a race enter the corresponding number and then enter 0 into the console");

        System.out.println("1. Dwarf\n" +
                "2. Elf\n" +
                "3. Halfling\n" +
                "4. Human\n" +
                "5. Dragonborne\n" +
                "6. Gnome\n" +
                "7. Half-Elf\n" +
                "8. Half-Orc\n" +
                "9. Tiefling");

        int choosenRace = ShowRaceInfo();
        System.out.println("Race has been selected. \n" +
                "Returning to main menu.");

    }



    /**
     * Shows the race information, based on a prompted input until a race is selected.
     * @return Returns an int corresponding to the chosen race.
     */
    private static int ShowRaceInfo(){

        int choosenRace = 0;
        Scanner sc = new Scanner(System.in);
        do{
            int displayraceinformation = sc.nextInt();

            switch (displayraceinformation){
                case 1:
                    System.out.println("The Dwarf:");
                    choosenRace = 1;
                    Race_Information.Dwarf_Info();
                    break;
                case 2:
                    System.out.println("The Elf:");
                    choosenRace = 2;

                    break;
                case 3:
                    System.out.println("The Halfling:");
                    choosenRace = 3;

                    break;
                case 4:
                    System.out.println("The Human:");
                    choosenRace = 4;

                    break;
                case 5:
                    System.out.println("The Dragonborne:");
                    choosenRace = 5;

                    break;
                case 6:
                    System.out.println("The Gnome:");
                    choosenRace = 6;

                    break;
                case 7:
                    System.out.println("The Half-Elf:");
                    choosenRace = 7;

                    break;
                case 8:
                    System.out.println("The Half-Orc");
                    choosenRace = 8;

                    break;
                case 9:
                    System.out.println("The Tiefling");
                    choosenRace = 9;

                    break;
            }

        }while(sc.nextInt() != 0);
        return choosenRace;
    }
}
