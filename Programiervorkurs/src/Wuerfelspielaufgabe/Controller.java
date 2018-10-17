package Wuerfelspielaufgabe;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hallo drücke Enter zum starten");
        sc.nextLine();


        Wuerfel w1 = new Wuerfel();
        Wuerfel w2 = new Wuerfel();

        Spieler s1 = new Spieler();
        Spieler s2 = new Spieler();











        w1.Farbewahl();
        w2.Farbewahl();


        Runde(s1,w1,s2,w2);



    }

    public static void Runde(Spieler s1,Wuerfel w1,Spieler s2, Wuerfel w2) {

        w1.Wuerfelwurf(s1);
        w2.Wuerfelwurf(s2);

        w1.Wuerfelwurf(s1);
        w2.Wuerfelwurf(s2);

        w1.Wuerfelwurf(s1);
        w2.Wuerfelwurf(s2);

        return;
    }
}









