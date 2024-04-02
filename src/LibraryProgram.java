import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LibraryProgram {
    public static void main(String[] args) {
        ArrayList<Borrowable> borrowables=new ArrayList<Borrowable>();
        Map<Integer,Title> titles=new HashMap<Integer,Title>();
        Library lib=new Library(borrowables,titles);
    }
}