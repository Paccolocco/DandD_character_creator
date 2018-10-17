package Wuerfelspielaufgabe;

import java.util.Random;
import java.util.Scanner;

public class Wuerfel {

    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);

    //Wuerfel
    public String farbe;
    public int augenzahl;

    //Wuerfelwurf
    public void Wuerfelwurf(Spieler s){

        augenzahl = rnd.nextInt(6)+1;
        System.out.println("Spieler "+ s.getName() + " hat mit dem " + farbe +"en Würfel eine "+ augenzahl+ " gewürfelt." );
        return;
    }

    //AugenZahlInWorten
    public void AugenZahlInWorten(){
        switch(augenzahl){
            case 1:
                System.out.println("Eins");
                break;
            case 2:
                System.out.println("Zwei");
                break;
            case 3:
                System.out.println("Drei");
                break;
            case 4:
                System.out.println("Vier");
                break;
            case 5:
                System.out.println("Fuenf");
                break;
            case 6:
                System.out.println("Sechs");
                break;
                default: return;


        }
    }

    //Farbwahl Wuerfel
    public void Farbewahl(){
        System.out.println("Wähle deine Lieblingsfarbe: ");
        this.farbe = sc.nextLine();
        return;
    }

}
