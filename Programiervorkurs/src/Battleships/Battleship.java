package Battleships;

import java.util.Random;

public class Battleship {
    public static void main(String[] args) {

        int[][] board = new int[5][5]; //definiert Brett als 5x5
        int[][] ships = new int[3][2]; //definiert 3 schiffe mit jeweils 2 Werten. hit/nothit.
        int[] shot = new int[2]; //Schuss -> 2 Werte. hit/nohit.
        int attempts = 0,//Zeit gebrauchte Versuche, wird nach jedem shot incrementet.
                shotHit = 0;

        //Als erstes wird das Spielbrett initiert.
        initBoard(board);
        showBoard(board);


    }

    //initiert Brett
    public static void initBoard(int[][] board) { //Anlegen der Methode zur erzeugung von Brett
        for (int zeile = 0; zeile < board.length; zeile++) { //zeile wird Brettlängenmal ausgeführt
            for (int reihe = 0; reihe < board[zeile].length; reihe++) { //für jede Ausführung wird eine reihe ausgeführt
                board[zeile][reihe] = -1; //alle Werte des Bretts werden auf -1 gesetzt.
            }
        }
    }

    //Grafische Darstellung Brett
    public static void showBoard(int[][] board) {
        System.out.println("\t1 \t2 \t3 \t4 \t5"); //ZEILEN werden deklariert
        System.out.println();

        for (int zeile = 0; zeile < board.length; zeile++) {//Anwendung auf bereits existierendes Brett
            System.out.print((zeile+1)+"");
            for (int reihe = 0; reihe < board[zeile].length; reihe++) {
                if (board[zeile][reihe] == -1) {//Brettwert -1 = Welle
                    System.out.print("\t" + "~");
                } else if (board[zeile][reihe] == 0) {//Brettwert 0 = Leer
                    System.out.print("\t" + "*");
                } else if (board[zeile][reihe] == 1) {//Brettwert 1 = Treffer
                    System.out.print("\t" + "X");
                }
            }
            System.out.println();
        }


    }

    //initiert Schiffe
    public static void initShips(int[][] ships) {
        Random rnd = new Random();

        for (int ship = 0; ship < 3; ship++) {
            ships[ship][0] = rnd.nextInt(5);
            ships[ship][1] = rnd.nextInt(5);

            //Prüfen ob eine Position doppelt belegt wurde...
            for (int last = 0; last < ship;last++ ){
                if(   (ships[ship][0])== (ships[last][0])&&(ships[ship][1] == ships[last][1]))
                do{
                    ships[ship][0]=rnd.nextInt(5);
                    ships[ship][1]=rnd.nextInt(5);
                }while( (ships[ship][0] == ships[last][0])&&(ships[ship][1] == ships[last][1]) );

            }

        }
    }
}
