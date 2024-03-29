public class BookCopy implements Borrowable{

    private int id;
    private boolean available;
    private Book book;
    private Member memberWhoBorrowed;

    public BookCopy(int id, boolean available) {
        this.id = id;
        this.available = available;
    }

    public BookCopy(int id, boolean available,Book book) {
        this.id = id;
        this.available = available;
        this.book=book;
        book.addBookCopy(this);
    }

    public int getId() {
        return id;
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

    public void setBook(Book book){
        this.book=book;
        book.addBookCopy(this);
    }

}
