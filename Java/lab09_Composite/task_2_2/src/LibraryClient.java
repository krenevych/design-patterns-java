public class LibraryClient {

  public static void main(String[] args) {

    Readable nonfictionBook = new NonfictionBook("A Brief History of Time");
    Readable fictionBookOne = new FictionBook("Hamlet", true);
    Readable fictionBookTwo = new FictionBook("The Great Gatsby", false);

    BookCollection bookCollection = new BookCollection();
    bookCollection.add(nonfictionBook);
    bookCollection.add(fictionBookOne);
    bookCollection.add(fictionBookTwo);


    checkoutBookCollection(bookCollection);

    nonfictionBook.checkout();
    fictionBookOne.checkout();
    returnBookCollection(bookCollection);
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
   * Повернути всі книги, що містяться у бібліотеці
   * зробити всі книги у бібліотеці доступними для замовлення іншим клієнтам
   *
   * @param bookCollection бібліотека книг
   */
  public static void returnBookCollection(BookCollection bookCollection) {
    bookCollection.returnReadable();
  }

}
