/**
 * Вегетаріанська піца
 */
public class VegetarianPizza {

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
    public void addToppings() {
        System.out.println("Add tomato");
        System.out.println("Add cheese");
        System.out.println("Add peppers");
        System.out.println("Add olives");
    }

    /**
     * Випікати підготовлену піцу
     */
    public void cook() {
        System.out.println("Cook in the oven for 15 minutes");
    }

    /**
     * Надрукувати рецепт
     */
    public void printInstructions() {
        makeBase();
        addToppings();
        cook();
        System.out.println();
    }


}
