import doomlib.Monster;
import doomlib.MonsterFactory;

public class CocodemonFactory implements MonsterFactory {
    @Override
    public Monster createMonster(String level) {
        return new Cocodemon(level);
    }
}
