import org.junit.*;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

  Library library;
  Book book;
  Member member;

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

  @Test
  public void canAddBook() {
    library.add(book);
    assertEquals(1, library.stockCount());
  }

  @Test
public void stockIsFull(){
  for(int i = 0; i<6; i++){
    library.add(book);
  }
  assertEquals(true, library.isStockFull());
}

@Test
public void borrowedStartsAsEmpty() {
  assertEquals(0, library.stockCount());
}


}
