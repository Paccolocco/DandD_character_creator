package Klassen;

public abstract class Klasse {

    private int experience = 0;
    private int lvl = 1;
    private int proficiencyModifier = 2;



    public abstract String getName();
    public abstract int getHitDice();

    /**
     * Adds the specified amount to the current experience.
     * @param amount (Positive Numbers) The amount to be added.
     */
    void addExperience(int amount){
        if (amount > 0){
            experience = experience + amount;
            this.update();
        }
        else{
            System.out.println("The amount of experience to be added was smaller than one");
        }
    }

    /**
     * Updates lvl, numHitDie and proficiencyModifier based on experience.
     */
    private void update(){
        if (experience < 300){
            lvl = 1;
            proficiencyModifier = 2;
        }else if (experience < 900){
            lvl = 2;
            proficiencyModifier = 2;
        }else if (experience < 2700){
            lvl = 3;
            proficiencyModifier = 2;
        }else if (experience < 6500){
            lvl = 4;
            proficiencyModifier = 2;
        }else if (experience < 14000){
            lvl = 5;
            proficiencyModifier = 3;
        }else if (experience < 23000){
            lvl = 6;
            proficiencyModifier = 3;
        }else if (experience < 34000){
            lvl = 7;
            proficiencyModifier = 3;
        }else if (experience < 48000){
            lvl = 8;
            proficiencyModifier = 3;
        }else if (experience < 64000){
            lvl = 9;
            proficiencyModifier = 4;
        }else if (experience < 85000){
            lvl = 10;
            proficiencyModifier = 4;
        }else if (experience < 100000){
            lvl = 11;
            proficiencyModifier = 4;
        }else if (experience < 120000){
            lvl = 12;
            proficiencyModifier = 4;
        }else if (experience < 140000){
            lvl = 13;
            proficiencyModifier = 5;
        }else if (experience < 165000){
            lvl = 14;
            proficiencyModifier = 5;
        }else if (experience < 195000){
            lvl = 15;
            proficiencyModifier = 5;
        }else if (experience < 225000){
            lvl = 16;
            proficiencyModifier = 5;
        }else if (experience < 265000){
            lvl = 17;
            proficiencyModifier = 6;
        }else if (experience < 305000){
            lvl = 18;
            proficiencyModifier = 6;
        }else if (experience < 355000){
            lvl = 19;
            proficiencyModifier = 6;
        }else {
            lvl = 20;
            proficiencyModifier = 6;
        }
    }

    //Getters and Setters
    public int getExperience() {
        return experience;
    }

    public int getLvl() {
        return lvl;
    }

    public int getNumHitDie() {
        return lvl;
    }

    public int getProficiencyModifier() {
        return proficiencyModifier;
    }
}
