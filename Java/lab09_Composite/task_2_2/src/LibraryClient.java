public class LibraryClient {

  public static void main(String[] args) {

    Book book = new Book("A Brief History of Time");
    FictionBook fictionBookOne = new FictionBook("Hamlet", true);
    FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

    BookCollection bookCollection = new BookCollection();
    bookCollection.add(book);
    bookCollection.add(fictionBookOne);
    bookCollection.add(fictionBookTwo);

    book.checkout();
    fictionBookOne.checkout();
    bookCollection.checkout();

    book.returnBook();
    fictionBookOne.returnBook();
    bookCollection.returnBook();
  }




}
