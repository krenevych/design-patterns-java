/**
 * Замовлення
 */
public class Order {

    String item;  // назва товару
    int quantity;  // кількість
    String address;  // адреса доставки
    String message = "";  // повідомлення

    public Order(String item, int quantity, String address, String message) {
        this.item = item;
        this.quantity = quantity;
        this.address = address;
        this.message = message;
    }

    public Order(Order other, String message) {
        this.item = other.item;
        this.quantity = other.quantity;
        this.address = other.address;
        this.message = message;
    }
}
