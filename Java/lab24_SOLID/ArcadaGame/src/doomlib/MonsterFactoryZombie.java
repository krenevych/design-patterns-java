package doomlib;

public class MonsterFactoryZombie implements MonsterFactory {
    @Override
    public Monster createMonster(String level) {
        return new Zombie(level);
    }
}
