class Library {
private String name;
private Book[] stock;
private Member[] borrowed;

public Library(String name ) {
  this.name = name;
  this.stock = new Book[6];
  this.borrowed = new Member[1];

}

public String getName() {
  return this.name;
}

public int stockCount(){
  int count = 0;
  for ( Book book : stock ){
    if (book != null){
      count++;
    }
  }
  return count;
}

public void add(Book book) {
  if( isStockFull() ) {
    return;
  }
  int stockCount = stockCount();
  stock[stockCount] = book;
}

public boolean isStockFull() {
  return stockCount() == stock.length;
}

public int borrowedCount(){
  int count = 0;
  for ( Member member : borrowed ){
    if (member != null){
      count++;
    }
  }
  return count;
}







}
