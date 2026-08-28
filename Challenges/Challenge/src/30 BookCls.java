class BookCls{

    static int TotalNoofbooks;


    String title;
    String Author;
    String isbn;

    boolean isBorrowed;

  static {
      TotalNoofbooks = 0;
  }

    {
        TotalNoofbooks++;
    }

    BookCls(String isbn, String title, String Author){
      this.isbn = isbn;
      this.title = title;
      this.Author = Author;
    }

    BookCls(String isbn){
       
        this(isbn, "unknown", "unknown");
    }

    void BorrowBook(){
      if(isBorrowed){
          System.out.println(this.title +"book is already borrowed");
      }else {
          this.isBorrowed = true;
          System.out.println("enjoy the "+ this.title +" book");
      }
    }

    void returnBook(){
      if(isBorrowed){
          this.isBorrowed = false;
          System.out.println("Hope you enjoy,give your review");

      }else {
          System.out.println("this book already in the library");
      }
    }

  public static void main(String[] arg){
      BookCls designofthings = new BookCls("1", "design","me");
      BookCls Mybook = new BookCls("2");

      System.out.println(BookCls.TotalNoofbooks);

      designofthings.BorrowBook();
      Mybook.BorrowBook();
      designofthings.BorrowBook();
      designofthings.returnBook();
      designofthings.returnBook();


  }

}
