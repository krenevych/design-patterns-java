public class Client {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        groceryList.add(new Bread());
        groceryList.add(new Bread());
        groceryList.add(new Milk());
        groceryList.add(new Coffee());

        System.out.println("Total price of grocery list: " + groceryList.getPrice());

        groceryList.accept(new DiscountVisitor());
        System.out.println("New total price of grocery list after discount: " + groceryList.getPrice());

        groceryList.accept(new InflationPriceVisitor());
        System.out.println("New total price of grocery list after price increase: " + groceryList.getPrice());

    }

}
