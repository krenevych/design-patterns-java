/**
 * Піца з шинкою
 */
public class MeatFeastPizza extends Pizza {

    /**
     * Додати наповнювачі
     */
    @Override
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
    @Override
    public void cook() {
        System.out.println("Cook in the oven for 20 minutes");
    }


}
