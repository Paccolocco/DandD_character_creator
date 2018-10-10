package resources;

import java.util.Scanner;

public class Introduction {

    public static void Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the D&D character creator \n" +
                "1.\tCreate new character \n2.\tLoad already existing chracter \n3.\tExit program");
        System.out.print("Type here: ");
        switch (sc.nextInt()){
            case 1:
                CreateCharacter.ChooseRace();
                break;
            case 2:
                //LoadCharacter...
                break;
            case 3:
                //ExitProgram...
                break;
        }
    }
}
