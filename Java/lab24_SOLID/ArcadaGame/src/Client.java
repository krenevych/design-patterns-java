import java.util.Scanner;

public class Client {
    private static final Scanner scanner = new Scanner(System.in);  // Create a Scanner object


    private static GameScene generateScene() {
        System.out.println("Select level (Easy/Medium/Nightmare): ");
        String level = scanner.nextLine();

        return new GameScene(level);
    }


    private static void addMonsters(GameScene scene){
        scene.addMonster(MonsterType.IMP);
        scene.addMonster(MonsterType.ZOMBIE);
        scene.addMonster(MonsterType.IMP);
        scene.addMonster(MonsterType.DEMON);
        scene.addMonster(MonsterType.DEMON);
        scene.addMonster(MonsterType.ZOMBIE);
    }

    public static void main(String[] args) {
        GameScene scene = generateScene();
        addMonsters(scene);
        scene.start();
    }
}
