package doomlib;

public class MonsterFactoryDemon implements MonsterFactory {
    @Override
    public Monster createMonster(String level) {
        return new Demon(level);
    }
}
