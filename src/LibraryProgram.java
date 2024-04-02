import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LibraryProgram {
    public static void main(String[] args) {
        Map<Integer,Borrowable> borrowables=new HashMap<Integer,Borrowable>();
        Map<Integer,Title> titles=new HashMap<Integer,Title>();
        Library lib=new Library(borrowables,titles);
        Book book1=new Book(1,"The Who","WhoKnows");
        Book book2=new Book(2,"The What","WhoKnows");
        Journal journal=new Journal(3,"The Which","John Balasis");
        lib.addTitle(1,book1);
        lib.addTitle(2,book2);
        lib.addTitle(3,journal);
        BookCopy myCopy=new BookCopy(1,true,2);
//        lib.addMember(1,"Mary");


//
//        myCopy.borrowItem(lib.getAllMembers().getFirst());
//        lib.displayAllMembers();
//        lib.displayBorrowedItems();

    }
}