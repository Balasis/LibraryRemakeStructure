import java.util.HashMap;
import java.util.Map;

public class Book extends Title{

    private String author;
    private Map<Integer,BookCopy> bookCopies;

    public Book(int id, String title, String author) {
        super(id, title);
        bookCopies=new HashMap<Integer, BookCopy>() {
        };
        this.author = author;
    }

    public void addBookCopy(BookCopy bookCopy){
        if (bookCopy.getBookId()==getId() && bookCopy.getBook()==null){
            bookCopy.setBook(this);
        }
        bookCopies.put(bookCopy.getId(),bookCopy);
    }

    public void removeBookCopy(BookCopy bookCopy){
        if (bookCopies.isEmpty()){
            return;
        }
        bookCopies.remove(bookCopy.getId());
    }

    public Map<Integer,BookCopy> getBookCopies(){
        return bookCopies;
    }
}
