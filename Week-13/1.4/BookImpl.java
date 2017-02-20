public class BookImpl implements Book {
  private final String author;
  private final String title;
  
  /**
    * Constructs BookImpl
	*/
  public BookImpl(String title, String author) {
	  this.title = title;
	  this.author = author;
  }

  @Override
  public String getAuthor() {
	  return author;
  }

  @Override
  public String getTitle() {
	  return title;
  }
  
}