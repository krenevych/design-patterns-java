/**
 * Піца з шинкою
 */
public class MeatFeastPizza {

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
        System.out.println("Add pepperoni");
        System.out.println("Add ham");
        System.out.println("Add chicken");
    }

    /**
     * Випікати підготовлену піцу
     */
    public void cook() {
        System.out.println("Cook in the oven for 20 minutes");
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
