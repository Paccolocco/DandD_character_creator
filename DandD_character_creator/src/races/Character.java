package races;

public abstract class Character {
    //Still in Development!

    //Base Stats for a character
    //Getter and Setter for all of those
    //Might implement stat changing in this package, so the setters can be deleted.
    private String name = "Unnamed";
    private int strength = -1;
    private int dexterity = -1;
    private int constitution = 1;
    private int intelligence = -1;
    private int wisdom = -1;
    private int charisma = -1;

    //Derived base Stats
    //Only Getters for those
    private int maxHitPoints = -1;      //Partly implemented
    private int armorClass = -1;        //Not yet implemented
    private int speed = -1;             //Not yet implemented
    private int passivePerception = -1; //Mostly implemented

    //Variable Stats
    private int currentHitPoints = -1;  //Implemented

    /**
     * Subtracts the given amount from the current HP. Can be used as a heal as well.
     * @param amount The amount to subtract. Negative amounts effectively "heal" the object.
     */
    public void damage(int amount){
        if (currentHitPoints-amount >= maxHitPoints){
            currentHitPoints = maxHitPoints;
        }else{
            currentHitPoints = currentHitPoints - amount;
            if (currentHitPoints <= 0){
                //Implement proper Death Function.
                System.out.println("Hitpoints of " + name + " have been reduced to: " + currentHitPoints);
            }
        }
    }

    /**
     * Updates the passive perception based on the Wisdom.
     */
    private void updatePassivePerception(){
        //TODO Proficiency is not being calculated right now.
        this.passivePerception = 10 + (int) Math.floor((double) (this.wisdom-10)/2);
    }
    //Getter and Setter
    public int getStrength() {
        return strength;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    void setWisdom(int wisdom) {
        this.wisdom = wisdom;
        this.updatePassivePerception();
    }

    public int getCharisma() {
        return charisma;
    }

    void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPassivePerception() {
        return passivePerception;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }
}
