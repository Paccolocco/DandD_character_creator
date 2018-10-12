package races;

import java.util.Random;

public class Dwarf extends PlayerCharacter {

    public Dwarf(){
        /*
        Set Speed to 25 ft.
        Languages?: Common and Dwarvish
        Other Racial Traits?
        */

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
    }
}
