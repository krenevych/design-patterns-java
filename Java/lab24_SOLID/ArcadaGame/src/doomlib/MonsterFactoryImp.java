package doomlib;

public class MonsterFactoryImp implements MonsterFactory {
    @Override
    public Monster createMonster(String level) {
        return new Imp(level);
    }
}
