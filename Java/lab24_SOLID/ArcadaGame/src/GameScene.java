import java.util.ArrayList;
import java.util.List;

/**  Ігрова сцена  */
public class GameScene {

    private final String level;  // Складність гри

    private final List<Demon> demons = new ArrayList<>();
    private final List<Imp> imps = new ArrayList<>();
    private final List<Zombie> zombies = new ArrayList<>();

    public GameScene(String level) {
        this.level = level;
    }
    /**
     * Додати монстра на ігровий рівень
     * @param type - тип монстра
     */
    public void addMonster(MonsterType type) {
        switch (type) {
            case ZOMBIE:
                Zombie zombie = new Zombie(level);
                zombies.add(zombie);
                break;
            case IMP:
                Imp imp = new Imp(level);
                imps.add(imp);
                break;
            case DEMON:
                Demon demon = new Demon(level);
                demons.add(demon);
                break;
            default:
                throw new IllegalStateException("Unexpected type: " + type);
        }
    }

    /**
     * Запустити рівень
     */
    public void start() {
        for (Demon demon : demons) demon.shoot();
        for (Zombie zombie : zombies) zombie.shoot();
        for (Imp imp : imps) imp.shoot();
    }

}
