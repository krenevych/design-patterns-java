public class LibraryClient {

  public static void main(String[] args) {

    NonfictionBook nonfictionBook = new NonfictionBook("A Brief History of Time");
    FictionBook fictionBookOne = new FictionBook("Hamlet", true);
    FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

    BookCollection bookCollection = new BookCollection();
    bookCollection.addNonfictionBook(nonfictionBook);
    bookCollection.addFictionBook(fictionBookOne);
    bookCollection.addFictionBook(fictionBookTwo);

    checkoutNonfictionBook(nonfictionBook);
    checkoutFictionBook(fictionBookOne);
    checkoutBookCollection(bookCollection);

    returnNonfictionBook(nonfictionBook);
    returnFictionBook(fictionBookOne);
    returnBookCollection(bookCollection);
  }

  /**
   * Замовити (зарезервувати) документальну книгу
   * Замовлення можливе лише, якщо книга доступна для замовлення
   *
   * @param nonfictionBook книга для перевірки
   */
  public static void checkoutNonfictionBook(NonfictionBook nonfictionBook) {
    nonfictionBook.checkout();
  }

  /**
   * Замовити (зарезервувати) художню книгу
   * Замовлення можливе лише, якщо книга доступна для замовлення
   *
   * @param fictionBook книга для замовлення
   */
  public static void checkoutFictionBook(FictionBook fictionBook) {
    fictionBook.checkout();
  }

  /**
   * Замовити (зарезервувати) всі книги, що містяться у бібліотеці
   *
   * @param bookCollection бібліотека, що містить як художні так і документальні книги
   */
  public static void checkoutBookCollection(BookCollection bookCollection) {
    bookCollection.checkout();
  }

  /**
   * Повернути документальну книгу до бібліотеки
   * зробити її доступної для замовлення іншим клієнтам
   *
   * @param nonfictionBook книга
   */
  public static void returnNonfictionBook(NonfictionBook nonfictionBook) {
    nonfictionBook.returnBook();
  }

  /**
   * Повернути художню книгу до бібліотеку
   * зробити її доступної для замовлення іншим клієнтам
   *
   * @param fictionBook книга
   */
  public static void returnFictionBook(FictionBook fictionBook) {
    fictionBook.returnBook();
  }

  /**
   * Повернути всі книги, що містяться у бібліотеці
   * зробити всі книги у бібліотеці доступними для замовлення іншим клієнтам
   *
   * @param bookCollection бібліотека книг
   */
  public static void returnBookCollection(BookCollection bookCollection) {
    bookCollection.returnBook();
  }

}
