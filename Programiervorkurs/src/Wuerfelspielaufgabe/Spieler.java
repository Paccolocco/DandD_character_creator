package Wuerfelspielaufgabe;

import java.util.Scanner;

public class Spieler{

    Scanner sc = new Scanner(System.in);

    //Spieler
    private String name;
    private int alter;

    public Spieler(){
        System.out.println("Ples do se Namenseingebung: ");
        name = sc.nextLine();
        System.out.println("how old is u mi fren? ");
        alter = sc.nextInt();
    }

    public void setName(String name){
        this.name = name;
        return;
    }
    public String getName(){
        return this.name;
    }
    public void setAlter(int alter){
        this.alter = alter;
        return;
    }
    public int getAlter(){
        return  this.alter;
    }
    //Namenswahl
    public void Namenswahl(){
        System.out.println("Bitte Namen eingeben: ");
        name = sc.nextLine();
        return;
    }

}
