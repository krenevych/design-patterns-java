public class MilitaryBase extends MilitaryObject {

    /**
     * Кількість офіцерів на військовій базі
     */
    private int officers;

    /**
     * Кількість солдат на військовій базі
     */
    private int soldiers;

    /**
     * Кількість джипів на військовій базі
     */

    private int jeeps;

    /**
     * Кількість танків на військовій базі
     */
    private int tanks;


    public MilitaryBase(int officers, int soldiers, int jeeps, int tanks) {
        this.officers = officers;
        this.soldiers = soldiers;
        this.jeeps = jeeps;
        this.tanks = tanks;
    }

    public int getOfficers() {
        return officers;
    }

    public void setOfficers(int officers) {
        this.officers = officers;
    }

    public int getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(int soldiers) {
        this.soldiers = soldiers;
    }

    public int getJeeps() {
        return jeeps;
    }

    public void setJeeps(int jeeps) {
        this.jeeps = jeeps;
    }

    public int getTanks() {
        return tanks;
    }

    public void setTanks(int tanks) {
        this.tanks = tanks;
    }

    @Override
    public String toString() {
        return "MilitaryBase{" +
                "officers=" + officers +
                ", soldiers=" + soldiers +
                ", jeeps=" + jeeps +
                ", tanks=" + tanks +
                '}';
    }
}
