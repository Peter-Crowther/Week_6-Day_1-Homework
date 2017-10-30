import org.junit.*;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

  Library library;
  Book book;

  @Before
    public void before() {
      this.library = new Library ("Bookworm's");
      this.book = new Book();
    }


  @Test
  public void hasName() {
    String name = this.library.getName();
    assertEquals("Bookworm's", name);
  }

  @Test
  public void stockStartsAsEmpty() {
    assertEquals(0, library.stockCount());
  }


}
