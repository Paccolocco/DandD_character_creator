package resources;

import java.util.Scanner;

class Race_Information {

    /**
     * Gives windows that inform about Dwarves.
     */
    //TODO Show it in Windows, or change the Javadoc.
    static void Dwarf_Info() {
        Scanner sc = new Scanner(System.in);


        int SwitchChoice;

        do {
            System.out.println();
            System.out.println("1. Display short Information\t2. Dwarf Traits\t3. Show subraces\t0. Exit");
            SwitchChoice = sc.nextInt();
            switch (SwitchChoice) {
                case 1:
                    ShortInformation_Dwarves();
                    break;
                case 2:
                    System.out.println("Dwarf Traits: (To look up what traits are enter 1 otherwise enter 2 to return enter 3):");
                    int switchChoice2;
                    do {
                        switchChoice2 = sc.nextInt();
                        switch (switchChoice2) {
                            case 1:
                                System.out.println("X");
                                //Insert method to explain here.
                                break;
                            case 2:
                                DwarfTraits();
                                break;
                        }
                    } while (switchChoice2 != 3);
                    System.out.println("returned");
                    break;
                case 3:
                    System.out.println("Subraces:\t1. Hill Dwarf\t2. Mountain Dwarf\t3. return");

                    int SwitchChoice2;
                    do {
                        SwitchChoice2 = sc.nextInt();
                        switch (SwitchChoice2) {
                            case 1:
                                HillDwarfTraits();
                                break;
                            case 2:
                                MountainDwarfTraits();
                                break;
                        }
                    } while (SwitchChoice2 != 3);
                    System.out.println("returned");
                    break;
            }

        }
        while (SwitchChoice != 0);
        sc.close();
    }


    /**
     * Displays Short Information about Dwarves.
     */
    private static void ShortInformation_Dwarves() {
        System.out.println("Breakdown:");
        System.out.println("- Dwarves are known as skilled warriors, miners, and workers of stone and metal.\n" +
                "- Dwarven skin ranges from deep brown to a paler hue tinged with red.\n" +
                "- Dwarven hair, worn long but in simple styles, is usually black, gray, or brown.\n" +
                "- Dwarves respect the traditions of their clans.\n" +
                "- Part of those traditions is devotion to the gods of the dwarves, who uphold the dwarven \n" +
                "  ideals of industrious labor, skill in battle, and devotion to the forge.\n" +
                "- Individual dwarves are determined and loyal, true to their word and decisive in action\n" +
                "  some times to the point of stubbornness.\n" +
                "- Strong sense of justice.\n" +
                "- Dwarves get along passably well with most other races. But it takes time to gain their trust.");
    }

    /**
     * Displays the traits of a Dwarf.
     */
    private static void DwarfTraits() {
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
    }

    /**
     * Displays the traits of a Hill Dwarf.
     */
    private static void HillDwarfTraits() {
        System.out.println("Hill Dwarf:");
        System.out.println("Hill dwarves have keen senses, deep intuition, and remarkable resilience.");
        System.out.println("Hill Dwarf traits:\n" +
                "- Ability Score Increase: Wisdom score +1\n" +
                "- Dwarven Toughness: hit point maximum +1, and +1 every time you level up.");
    }

    /**
     * Displays the traits of aMountain Dwarf.
     */
    private static void MountainDwarfTraits() {
        System.out.println("Mountain Dwarf:");
        System.out.println("Mountain dwarves, are strong and hardy, accustomed to a difficult life in rugged terrain.");
        System.out.println("Mountain Dwarf traits:\n" +
                "- Ability Score Increase: Strength score +2.\n" +
                "- Dwarven Armor Training: Proficiency with light and medium armor.");
    }
}


