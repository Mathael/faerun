package actors;

import interfaces.Soldier;
import utils.Util;

/**
 * @author Leboc Philippe
 */
public abstract class Character implements Soldier {

    private String name;
    private int currentHealth;
    private int numberOfDice;
    private int cost;

    public Character() {
        setCurrentHealth(100);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    protected void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    protected void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int getCost() {
        return cost;
    }

    protected void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isDead() {
        return getCurrentHealth() <= 0;
    }

    @Override
    public void handleAttack(Character character) {
        int dmg = Util.roll(3, getNumberOfDice());
        if(dmg >= (getNumberOfDice() * 3) - 5) {
            dmg *= 2;
        }
        character.handleReceiveDamage(dmg);
    }

    @Override
    public void handleReceiveDamage(int damage) {
        setCurrentHealth(getCurrentHealth() - damage);
    }

    @Override
    public String toString() {
        return getName()+" ["+getCurrentHealth()+"]";
    }
}
