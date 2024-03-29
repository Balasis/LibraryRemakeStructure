public class BookCopy implements Borrowable{

    private int id;
    private boolean available;
    private Book book;
    private Member memberWhoBorrowed;

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
//     if    () perhaps add field into member about how many he owns so far and then compare
//    this.memberWhoBorrowed=member;
//    int newMaxOnLoan=member.getMAX_ON_LOAN()+1;
//    member.setMAX_ON_LOAN();
    }

    public void returnItem(){
    this.memberWhoBorrowed=null;
    }

}
