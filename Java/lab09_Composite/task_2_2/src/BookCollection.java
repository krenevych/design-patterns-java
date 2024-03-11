import java.util.ArrayList;

/**
 * Бібліотека книг, що містить документальні та художні книги
 */
public class BookCollection {

  /**
   * Список документальних книг, що містяться у бібліотеці
   */
  private final ArrayList<NonfictionBook> nonfictionBooks = new ArrayList<>();

  /**
   * Список художніх книг, що містяться у бібліотеці
   */
  private final ArrayList<FictionBook> fictionBooks = new ArrayList<>();

  /**
   * Додати документальну книгу в бібліотеку
   *
   * @param nonfictionBook документальна книга
   */
  public void addNonfictionBook(NonfictionBook nonfictionBook) {
    nonfictionBooks.add(nonfictionBook);
  }

  /**
   * Додати художню книгу в бібліотеку
   *
   * @param fictionBook художня книга
   */
  public void addFictionBook(FictionBook fictionBook) {
    fictionBooks.add(fictionBook);
  }

  /**
   * Перевірити на доступність всі книжки в бібліотеці
   * (чи були вони взяті для читання)
   */
  public void checkout() {
    for (NonfictionBook nonfictionBook : nonfictionBooks) {
      nonfictionBook.checkout();
    }
    for (FictionBook fictionBook : fictionBooks) {
      fictionBook.checkout();
    }
  }

    /**
   * Повернути всі книжки до бібліотеки (зробити доступними)
   */
  public void returnBook() {
    for (NonfictionBook nonfictionBook : nonfictionBooks) {
      nonfictionBook.returnBook();
    }
    for (FictionBook fictionBook : fictionBooks) {
      fictionBook.returnBook();
    }
  }


}
