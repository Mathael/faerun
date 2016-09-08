package actors;

public class ChefNain extends GuerrierNain {

    public ChefNain() {
        super();
        setName("Chef Nain");
        setCost(3);
        setNumberOfDice(10);
    }

    @Override
    public void handleReceiveDamage(int damage) {
        super.handleReceiveDamage(damage);
        setCurrentHealth(getCurrentHealth() - (damage / 2));
    }
}
