public class BookCopy implements Borrowable{
    private int id;
    private boolean available;
    private Member memberWhoBorrowed;
    public BookCopy(int id, boolean available) {
        this.id = id;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable(){
        return available;
    }

    public void borrowItem(Member member){
    this.memberWhoBorrowed=member;
    }

    public void returnItem(){

    }

}
