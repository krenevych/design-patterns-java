import doomlib.GameScene;
import doomlib.MonsterFactoryDemon;
import doomlib.MonsterFactoryImp;
import doomlib.MonsterFactoryZombie;

import java.util.Scanner;

public class Client {
    private static final Scanner scanner = new Scanner(System.in);  // Create a Scanner object


    private static GameScene generateScene() {
        System.out.println("Select level (Easy/Medium/Nightmare): ");
        String level = scanner.nextLine();

        return new GameScene(level);
    }



    private static void addMonsters(GameScene scene){
        MonsterFactoryImp monsterFactoryImp = new MonsterFactoryImp();
        MonsterFactoryDemon monsterFactoryDemon = new MonsterFactoryDemon();
        MonsterFactoryZombie monsterFactoryZombie = new MonsterFactoryZombie();
        CocodemonFactory cocodemonFactory = new CocodemonFactory();

        scene.addMonster(monsterFactoryImp);
        scene.addMonster(monsterFactoryZombie);
        scene.addMonster(monsterFactoryImp);
        scene.addMonster(monsterFactoryDemon);
        scene.addMonster(monsterFactoryDemon);
        scene.addMonster(monsterFactoryZombie);
        scene.addMonster(cocodemonFactory);
        scene.addMonster(cocodemonFactory);
        scene.addMonster(cocodemonFactory);
        scene.addMonster(cocodemonFactory);


    }

    public static void main(String[] args) {
        GameScene scene = generateScene();
        addMonsters(scene);
        scene.start();
    }
}
