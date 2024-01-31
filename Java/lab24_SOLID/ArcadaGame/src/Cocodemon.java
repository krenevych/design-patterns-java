import doomlib.Monster;

public class Cocodemon extends Monster {

    public Cocodemon(String level) {
        super(level);
    }

    @Override
    public void shoot() {
        System.out.printf("Creature: %s, " +
                        "level %s, action: shoots\n",
                "Cocodemon", level);
    }

}
