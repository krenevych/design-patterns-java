package doomlib;

public class Demon extends Monster{

    public Demon(String level) {
        super(level);
    }

    @Override
    public void shoot() {
        System.out.printf("Creature: %s, " +
                "level %s, action: shoots\n",
                "doomlib.Demon", level);
    }
}
