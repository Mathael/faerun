package interfaces;

import actors.Character;

/**
 * @author Leboc Philippe
 */
public interface Soldier {
    void handleAttack(Character character);
    void handleReceiveDamage(int damage);
}
