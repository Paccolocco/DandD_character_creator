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
    private int maxHitPoints = -1;      //TODO Partly implemented
    //TODO Do we want this? private int armorClass = -1;        //TODO Not yet implemented
    private int passivePerception = -1; //TODO Mostly implemented (see updatePassivePerception)

    //Variable Stats
    private int currentHitPoints = -1;  //Implemented

    //Further Variables, that need to be implemented by child-classes.
    abstract int getSpeed();


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
                //TODO Implement proper Death Function.
                System.out.println("Hitpoints of " + getName() + " have been reduced to: " + currentHitPoints);
            }
        }
    }

    /**
     * Updates the passive perception based on the Wisdom.
     */
    private void updatePassivePerception(){
        //TODO Proficiency is not being calculated right now.
        //Base 10 plus ability modifier equals passive perception.
        this.passivePerception = 10 + (int) Math.floor((double) (this.wisdom-10)/2);
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

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

    void setMaxHitPoints(int maxHitPoints){
        this.maxHitPoints = maxHitPoints;
        this.currentHitPoints = maxHitPoints;
    }

    public int getPassivePerception() {
        return passivePerception;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }
}
