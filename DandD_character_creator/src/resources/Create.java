package resources;

import Klassen.Klasse;
import races.Dwarf;
import races.PlayerCharacter;

import java.util.Random;
import java.util.Scanner;

public class Create {

    /**
     * Creates a new PlayerCharacter.
     * @param raceNo The Number corresponding to the race the new PlayerCharacter should be.
     * @param emptyClass An empty instance of the wanted class.
     * @return Returns the new created PlayerCharacter.
     */
    public static PlayerCharacter Player(int raceNo, Klasse emptyClass){
        int[] orderedAbilityScores = {13,13,13,12,12,12};
        Scanner sc = new Scanner(System.in); //TODO Close Scanner
        System.out.println("Do you want to customize your ability Scores?\n" +
                "Enter 1 for yes:"); //TODO wording...
        if (sc.nextInt() == 1){ //TODO Catch exception
            //TODO Implement point buy. Useless, because it would be redone with a GUI. Therefore --> orderedAbilityScores is initialized and declared. Remove that if you implement this.
        }else{
            int[] abilityValues = RollAbilityScores();
            System.out.println("You have rolled the Scores: ");
            for (int i = 0; i<abilityValues.length; i++){
                System.out.print("#" + (i+1) + ": " + abilityValues[i] + " |");
            }
            orderedAbilityScores = AssignAbilityScores(abilityValues);
        }

        return CreateRace(orderedAbilityScores, raceNo, emptyClass);
    }

    private static PlayerCharacter CreateRace(int[] orderedAbilityScores, int raceNo, Klasse emptyClass) {
        PlayerCharacter createdCharacter = Dwarf.Generate(orderedAbilityScores, emptyClass);
        //TODO Remove the assignment here. It is just here to remove the Error of the return.
        switch (raceNo){
            case 1:
                createdCharacter = Dwarf.Generate(orderedAbilityScores, emptyClass);
                break;
            case 2:
                // TODO createdCharacter = new Elf(orderedAbilityScores, emptyClass);
                //TODO Elf
                break;
            case 3:
                //TODO createdCharacter = new Halfling(orderedAbilityScores, emptyClass);
                //TODO Halfling
                break;
            case 4:
                //TODO createdCharacter = new Human(orderedAbilityScores, emptyClass);
                //TODO Human
                break;
            case 5:
                //TODO createdCharacter = new Dragonborne(orderedAbilityScores, emptyClass);
                //TODO Drangonborne
                break;
            case 6:
                //TODO createdCharacter = new Gnome(orderedAbilityScores, emptyClass);
                //TODO Gnome
                break;
            case 7:
                //TODO createdCharacter = new HalfElf(orderedAbilityScores, emptyClass);
                //TODO Half-Elf
                break;
            case 8:
                //TODO createdCharacter = new HalfOrc(orderedAbilityScores, emptyClass);
                //TODO Half-Orc
                break;
            case 9:
                //TODO createdCharacter = new Tiefling(orderedAbilityScores, emptyClass);
                //TODO Tiefling
                break;
        }
        return createdCharacter;
    }

    /**
     * Rolls 4 dice for each Ability(6 times). Then deletes the smallest value and adds the rest.
     * Creating 6 values that can be assigned to ability scores.
     * @return Returns an int[] with the 6 values.
     */
    private static int[] RollAbilityScores(){
        //This Block is for determining the Rolls for the ability values.
        Random rnd = new Random();
        //Create an array. First dim corresponds to the abilities.
        //Second dim corresponds to the throws. It gets filled and the lowest number erased.
        int [][] abilityThrows = new int[6][4];
        for (int i = 0; i<abilityThrows.length; i++){
            int tempLowPos = 0;
            for (int j = 0; j<abilityThrows[i].length; j++){
                abilityThrows[i][j] = rnd.nextInt(5)+1;
                if (abilityThrows[i][j]<abilityThrows[i][tempLowPos]){
                    tempLowPos = j;
                }
            }
            abilityThrows[i][tempLowPos] = 0;
        }
        //Adds the remaining throws and stores it in an array.
        int [] abilityValues = new int[6];
        for (int i = 0; i<abilityThrows.length; i++){
            int tempSum = 0;
            for (int j = 0; j<abilityThrows[i].length; j++){
                tempSum = tempSum + abilityThrows[i][j];
            }
            abilityValues[i] = tempSum;
        }
        return abilityValues;
    }

    /**
     * Takes 6 values in an array, prints them out and asks the user to assign them to the Abilities. Does not print out the values!!!
     * @param unorderedScores An array of length 6 that contains the values to assign to the Abilities.
     * @return Returns a int[] with the values in following order: Strength-->Dexterity-->Constitution-->Intelligence-->Wisdom-->Charisma
     */
    private static int[] AssignAbilityScores(int[] unorderedScores){
        int[] orderedScores = {0,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("For each stat, enter the number of the Score you wish to assign.");
        System.out.println("Strength: ");
        //TODO Each while Loop is a assignment. Can do that a lot neater. and does not need to ask for the last ability Score...
        while(orderedScores[0] == 0){
            input = sc.nextInt();
            if (input<=6 && input>=1){
                orderedScores[0] = unorderedScores[(input-1)];
                unorderedScores[(input-1)] = 0;
            }else{
                System.out.println("Wrong Input! Try again: ");
            }
        }
        System.out.println("Dexterity: ");
        while(orderedScores[1] == 0){
            input = sc.nextInt();
            if (input<=6 && input>=1 && unorderedScores[(input-1)]!=0){
                orderedScores[1] = unorderedScores[(input-1)];
                unorderedScores[(input-1)] = 0;
            }else{
                System.out.println("Wrong Input! Try again: ");
            }
        }
        System.out.println("Constitution: ");
        while(orderedScores[2] == 0){
            input = sc.nextInt();
            if (input<=6 && input>=1 && unorderedScores[(input-1)]!=0){
                orderedScores[2] = unorderedScores[(input-1)];
                unorderedScores[(input-1)] = 0;
            }else{
                System.out.println("Wrong Input! Try again: ");
            }
        }
        System.out.println("Intelligence: ");
        while(orderedScores[3] == 0){
            input = sc.nextInt();
            if (input<=6 && input>=1 && unorderedScores[(input-1)]!=0){
                orderedScores[3] = unorderedScores[(input-1)];
                unorderedScores[(input-1)] = 0;
            }else{
                System.out.println("Wrong Input! Try again: ");
            }
        }
        System.out.println("Wisdom: ");
        while(orderedScores[4] == 0){
            input = sc.nextInt();
            if (input<=6 && input>=1 && unorderedScores[(input-1)]!=0){
                orderedScores[4] = unorderedScores[(input-1)];
                unorderedScores[(input-1)] = 0;
            }else{
                System.out.println("Wrong Input! Try again: ");
            }
        }
        System.out.println("Charisma: ");
        while(orderedScores[5] == 0){
            input = sc.nextInt();
            if (input<=6 && input>=1 && unorderedScores[(input-1)]!=0){
                orderedScores[5] = unorderedScores[(input-1)];
                unorderedScores[(input-1)] = 0;
            }else{
                System.out.println("Wrong Input! Try again: ");
            }
        }
        return orderedScores;
    }
}
