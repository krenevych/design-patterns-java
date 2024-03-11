import java.util.ArrayList;

/**
 * Бібліотека книг, що містить документальні та художні книги
 */
public class BookCollection implements Readable {

    /**
     * Список документальних книг, що містяться у бібліотеці
     */
    private final ArrayList<Readable> readables = new ArrayList<>();


    /**
     * Додати * в бібліотеку
     *
     * @param readable документальна книга
     */
    public void add(Readable readable) {
        readables.add(readable);
    }

    /**
     * Перевірити на доступність всі книжки в бібліотеці
     * (чи були вони взяті для читання)
     */
    @Override
    public void checkout() {
        for (Readable child : readables) {
            child.checkout();
        }
    }

    /**
     * Повернути всі книжки до бібліотеки (зробити доступними)
     */
    @Override
    public void returnBook() {
        for (Readable child : readables) {
            child.returnBook();
        }
    }


}
