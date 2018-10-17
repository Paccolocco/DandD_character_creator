package SchiffeVersenken;

import java.util.Scanner;

public class Spielfeldproperties {

    public static void main(String[] args) {
        int k [][] = new int[12][8];
        Scanner sc = new Scanner(System.in);


        System.out.println("Bitte tragen sie 10 Koordinaten ein:");
    for (int l=0;l<=10;l++) {

        System.out.println("x-Koordinate:");
        int x = sc.nextInt();

        System.out.println("y-Koordinate:");
        int y = sc.nextInt();

        k[x][y]=1;


    }




    for(int i=0;i<k.length;i++){
        System.out.println();
        for (int j=0;j<k[i].length;j++){
            System.out.print(k[i][j]+"\t");


        }

    }
}
}