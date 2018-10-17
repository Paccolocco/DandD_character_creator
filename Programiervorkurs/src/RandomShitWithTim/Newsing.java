package RandomShitWithTim;

import java.util.Random;

public class Newsing {
    public static void main(String[] args) {
        //GuessThisMethodexD(10, 50);
        BestMethode(10, 50, 0.00001);
    }

    public static void GuessThisMethodexD (int variable1, int variable2){
        for (int i = 0;i < variable1; i++){
            if (i != 0)
                System.out.println();
            for (int j = 0;j <variable2; j++){
                if ((j%2) != 0 ){
                    System.out.print("L");
                }
                else{
                    System.out.print("O");
                }
            }
        }
    }

    public static void BestMethode (int variable1, int variable2, double variable3){
        for (int i = 0;i < variable1; i++){
            if (i != 0)
                System.out.println();
            for (int j = 0;j <variable2; j++){
                Random rnd = new Random();
                int random = rnd.nextInt(100);
                double rndm = (double) random/100;
                if(rndm > variable3)
                    System.out.print("-");
                else
                    System.out.print("+");
            }
        }
    }
}
