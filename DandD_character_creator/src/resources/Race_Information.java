package resources;

import java.util.Scanner;

public class Race_Information {

     public static void Dwarf_Info(){
         Scanner sc = new Scanner(System.in);
         System.out.println("1. Display short Information\t2. Dwarf Traits\t3. Show subraces\t0. Exit");

         int SwitchChoice = sc.nextInt();
         do{
             switch (SwitchChoice){
                 case 1:
                     System.out.println("Breakdown:");
                     System.out.println("- Dwarves are known as skilled warriors, miners, and workers of stone and metal.\n"+
                             "- Dwarven skin ranges from deep brown to a paler hue tinged with red.\n"+
                             "- Dwarven hair, worn long but in simple styles, is usually black, gray, or brown.\n" +
                             "- Dwarves respect the traditions of their clans.\n" +
                             "- Part of those traditions is devotion to the gods of the dwarves, who uphold the dwarven \n"+
                             "  ideals of industrious labor, skill in battle, and devotion to the forge.\n" +
                             "- Individual dwarves are determined and loyal, true to their word and decisive in action\n" +
                             "  some times to the point of stubbornness.\n" +
                             "- Strong sense of justice.\n" +
                             "- Dwarves get along passably well with most other races. But it takes time to gain thier trust.");
                     break;
                 case 2:
                     System.out.println("Dwarf Traits (To look up what traits are enter 4):");
                     sc.nextInt();
                     if (sc.nextInt()==4){
                         //hier Methode zur Erklärung einfügen
                     }
                     System.out.println("- Ability Score Increase: Constitution score +2.\n" +
                             "- Age: Dwarves mature normally, they live about 350 years.\n" +
                             "- Alignment: lawful/good, tend to like order.\n" +
                             "- Size: 1.2 to 1.5 meters tall, average about 150 pounds, medium sizes creature.\n" +
                             "- Speed: base walking speed 7.5 meters. Not reduced by wearing heavy armor\n" +
                             "- Darkvision: dim light 60 feet like bright light, in darkness like in dim light.\n" +
                             "  only shades of gray in darkness.\n" +
                             "- Dwarven Resilience: advantage on saving throws against poison\n" +
                             "  + resistance against poison damage\n" +
                             "- Dwarven Combat Training: proficiency with battleaxe, handaxe, throwing hammer, warhammer.\n" +
                             "- Tool Proficiency: proficiency with 1 artisan tool : smith’s tools, brewer’s supplies, mason’s tools.\n" +
                             "- Stonecunning: Intelligence (History) check related to the origin of stonework, you \n" +
                             "  are considered proficient in the History skill and add double your proficiency bonus to the check.\n" +
                             "- Languages: Speak, read, and write Common and Dwarvish");
                     break;
                 case 3:
                     System.out.println("Subraces:\t1. Hill Dwarf\t2. Mountain Dwarf");
                     int SwitchChoice2 = sc.nextInt();
                     switch (SwitchChoice2){
                         case 1:
                             System.out.println("Hill Dwarf:");
                             System.out.println("Hill dwarfs have keen senses, deep intuition, and remarkable resilience.");
                             System.out.println("Hill Dwarf traits:\n" +
                                     "- Ability Score Increase: Wisdom score +1\n" +
                                     "- Dwarven Toughness: hit point maximum +1, and +1 every time you level up.");
                             break;
                         case 2:
                             System.out.println("Mountain Dwarf:");
                             System.out.println("Mountain dwarfs, are strong and hardy, accustomed to a difficult life in rugged terrain.");
                             System.out.println("Mountain Dwarf traits:\n" +
                                     "- Ability Score Increase: Strength score +2.\n" +
                                     "- Dwarven Armor Training: Proficiency with light and medium armor.");
                             break;
                     }
                     break;
             }

         }
         while (sc.nextInt() != 0);


        return;
    }
}


