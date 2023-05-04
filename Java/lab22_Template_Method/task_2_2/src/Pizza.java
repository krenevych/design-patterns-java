public abstract class Pizza {

    /**
     * Підготувати тісто
     */
    public void makeBase() {
        System.out.println("Mix flour, yeast and salt");
        System.out.println("Roll out the dough");
    }

    /**
     * Додати наповнювачі
     */
    abstract public void addToppings();

    /**
     * Випікати підготовлену піцу
     */
    abstract public void cook();

    /**
     * Надрукувати рецепт
     */
    final public void printInstructions() {
        makeBase();
        addToppings();
        cook();
        System.out.println();
    }
}
