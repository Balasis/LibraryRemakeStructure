import java.util.ArrayList;

public class Book extends Title{

    private String author;
    private ArrayList<BookCopy> bookCopies;

    public Book(int id, String title, String author) {
        super(id, title);
        bookCopies=new ArrayList<BookCopy>();
        this.author = author;
    }

    public void addBookCopy(BookCopy bookCopy){
        bookCopies.add(bookCopy);
    }

    public void removeBookCopy(BookCopy bookCopy){
        if (bookCopies.isEmpty()){
            return;
        }
        bookCopies.removeIf(c -> c.getId() == bookCopy.getId());
    }

}
