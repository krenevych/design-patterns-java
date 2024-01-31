package doomlib;

public class Imp extends Monster{

    public Imp(String level) {
        super(level);
    }

    @Override
    public void shoot() {
        System.out.printf("Creature: %s, " +
                "level %s, action: shoots\n",
                "doomlib.Imp", level);
    }

}
