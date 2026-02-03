public class Imp {

    private final String level;

    public Imp(String level) {
        this.level = level;
    }

    public void shoot() {
        System.out.printf("Creature: %s, level %s, action: shoots\n", "Imp", level);
    }

}
