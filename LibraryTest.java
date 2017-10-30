import org.junit.*;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

  Library library;

  @Before
    public void before() {
      this.library = new Library ("Bookworm's");
    }


  @Test
  public void hasName() {
    String name = this.library.getName();
    assertEquals("Bookworm's", name);
  }


}
