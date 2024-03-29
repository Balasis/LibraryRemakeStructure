public class BookCopy implements Borrowable{

    private int id;
    private boolean available;
    private Book book;
    private Member memberWhoBorrowed;

    public BookCopy(int id, boolean available,Book book) {
        this.id = id;
        this.available = available;
        this.book=book;
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

}
