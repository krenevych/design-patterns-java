package doomlib;

import java.util.ArrayList;
import java.util.List;

/**
 * Ігрова сцена
 */
public class GameScene {
    private final String level;  // Складність гри
    private final List<Monster> monsters = new ArrayList<>();

    public GameScene(String level) {
        this.level = level;
    }

    /**
     * Додати монстра на ігровий рівень
     * @param monsterFactory - тип монстра
     */
    public void addMonster(MonsterFactory monsterFactory) {
        Monster monster = monsterFactory.createMonster(level);
        monsters.add(monster);
    }

    /**
     * Запустити рівень
     */
    public void start() {
        for (Monster monster : monsters) {
            monster.shoot();
        }

    }

}
