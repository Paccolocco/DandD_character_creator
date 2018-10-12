package races;

public abstract class Character {
    //Still in Development!

    //Base Stats for a character
    //Getter and Setter for all of those
    private int strength = -1;
    private int dexterity = -1;
    private int constitution = 1;
    private int intelligence = -1;
    private int wisdom = -1;
    private int charisma = -1;

    //Derived base Stats
    //Only Getters for those
    private int maxHitPoints = -1;
    private int armorClass = -1;
    private int speed = -1;
    private int passivePerception = -1;

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

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
        this.updatePassivePerception();
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
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
}
