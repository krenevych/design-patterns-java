package doomlib;

public abstract class Monster {

    final protected String level;

    public Monster(String level) {
        this.level = level;
    }

    abstract public void shoot();
}
