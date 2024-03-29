import java.util.ArrayList;

public class LibraryProgram {
    public static void main(String[] args) {
        ArrayList<Borrowable> borrowables=new ArrayList<Borrowable>();
        ArrayList<Title> titles=new ArrayList<Title>();
        Library library=new Library(borrowables,titles);
    }
}