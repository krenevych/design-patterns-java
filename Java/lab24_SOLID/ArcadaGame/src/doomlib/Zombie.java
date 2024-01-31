package doomlib;

public class Zombie extends Monster {

    public Zombie(String level) {
        super(level);
    }

    @Override
    public void shoot() {
        System.out.printf("Creature: %s, " +
                "level %s, action: shoots\n",
                "doomlib.Zombie", level);
    }

}
