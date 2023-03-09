/**
 * Художня книга
 */
public class FictionBook extends Book{

  private boolean isAPlay;   // книга є п'єсою

  public FictionBook(String name, boolean isAPlay) {
    super(name);
    this.isAPlay = isAPlay;
  }

}
