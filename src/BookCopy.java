public class BookCopy implements Borrowable{

    private int id;
    private int categoryId;//distinguish between borrowables in the ui...
    private boolean available;
    private Book book;
    private int bookId;//For sql fetch reasons
    private Member memberWhoBorrowed;

    public BookCopy(int id,int categoryId, boolean available,int bookId) {
        this.id = id;
        this.categoryId=categoryId;
        this.available = available;
        this.bookId=bookId;
    }

    public BookCopy(int id, int categoryId, boolean available,Book book) {
        this.id = id;
        this.categoryId=categoryId;
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

    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return (book!=null) ? book.getTitle() : "Unknown" ;
    }

    public int getFullId() {
        return Integer.parseInt(categoryId+""+id);
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
