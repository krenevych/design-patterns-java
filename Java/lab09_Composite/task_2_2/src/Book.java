public class Book implements Readable {

  private final String name; // назва книги
  boolean checkedOut;        // чи книга була замовлена (взята для прочитання)

  public Book(String name) {
    this.name = name;
    checkedOut = false;
  }

  /**
   * Замовити (зарезервувати для прочитання) книгу
   */
  @Override
  public void checkout() {
    if (!checkedOut) { // Якщо книга не була зарезервована, то вона доступна для резервування
      System.out.println("Checking out " + name + "\n");
      checkedOut = true;
    } else {
      System.out.println(name + " is already checked out\n");
    }
  }

  /**
   * Повернути книгу (зняти резервування)
   */
  @Override
  public void returnReadable() {
    if (checkedOut) {  // Якщо книга була зарезервована, то її можна повернути
      System.out.println("Returning " + name + "\n");
      checkedOut = false;
    } else {
      System.out.println(name + " is not checked out\n");
    }
  }

}
