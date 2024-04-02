import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LibraryProgram {
    public static void main(String[] args) {
        ArrayList<Borrowable> borrowables=new ArrayList<Borrowable>();
        Map<Integer,Title> titles=new HashMap<Integer,Title>();
        Library lib=new Library(borrowables,titles);
        //Drag from database the titles and any other borrowables



//        Book book1=new Book(1,"The Who","WhoKnows");
//        Book book2=new Book(2,"The What","WhoKnows");
//        Journal journal=new Journal(3,"The Which","John Balasis");
//        lib.addTitle(1,book1);
//        lib.addTitle(2,book2);
//        lib.addTitle(3,journal);
//
//        BookCopy myCopy=new BookCopy(1,true,2);
//        lib.addBorrowable(myCopy);
//        lib.displayAllBorrowables();


    }
}