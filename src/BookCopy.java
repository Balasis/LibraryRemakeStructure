public class BookCopy implements Borrowable{

    private int id;
    private boolean available;
    private Book book;
    private int bookId;//For sql fetch reasons
    private Member memberWhoBorrowed;

    public BookCopy(int id, boolean available,int bookId) {
        this.id = id;
        this.available = available;
        this.bookId=bookId;
    }

    public BookCopy(int id, boolean available,Book book) {
        this.id = id;
        this.available = available;
        this.book=book;
        this.bookId=book.getId();
        book.addBookCopy(this);
    }



    public boolean isAvailable(){
        return available;
    }

    public void borrowItem(Member member){
        memberWhoBorrowed=member;
        available=false;
    }

    public void returnItem(){
        memberWhoBorrowed=null;
        available=true;
    }

    public int getId() {
        return id;
    }

    public int getBookId() {
        return bookId;
    }

    public Book getBook(){
        return book;
    }

    public void setBook(Book book){
        this.book=book;
        book.addBookCopy(this);
    }

}
