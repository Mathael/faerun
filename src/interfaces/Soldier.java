package interfaces;

import actors.Character;

public interface Soldier {
    void handleAttack(Character character);
    void handleReceiveDamage(int damage);
}
