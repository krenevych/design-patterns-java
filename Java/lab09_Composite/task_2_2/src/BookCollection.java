import java.util.ArrayList;

/**
 * Бібліотека книг, що містить документальні та художні книги
 */
public class BookCollection implements Readable {

  /**
   * Список документальних книг, що містяться у бібліотеці
   */
  private final ArrayList<Readable> children = new ArrayList<>();

  public void add(Readable readable) {
    children.add(readable);
  }

  /**
   * Перевірити на доступність всі книжки в бібліотеці
   * (чи були вони взяті для читання)
   */
  @Override
  public void checkout() {
    for (Readable readable : children) {
      readable.checkout();
    }

  }

  /**
   * Повернути всі книжки до бібліотеки (зробити доступними)
   */
  @Override
  public void returnReadable() {
    for (Readable readable : children) {
      readable.returnReadable();
    }
  }


}
