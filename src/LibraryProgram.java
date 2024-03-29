import java.util.ArrayList;

public class LibraryProgram {
    public static void main(String[] args) {
        ArrayList<Borrowable> borrowables=new ArrayList<Borrowable>();
        ArrayList<Title> titles=new ArrayList<Title>();
        Library lib=new Library(borrowables,titles);
        Book book1=new Book(1,"The Who","WhoKnows");
        Book book2=new Book(2,"The What","WhoKnows");
        Journal journal=new Journal(3,"The Which","John Balasis");
        lib.addTitle(book1);
        lib.addTitle(book2);
        lib.addTitle(journal);
        BookCopy myCopy=new BookCopy(1,true,book1);
        lib.addBorrowable(myCopy);
        lib.addMember(1,"Mary");
        myCopy.borrowItem(lib.getAllMembers().getFirst());
        lib.displayAllMembers();
        lib.displayBorrowedItems();
        //a mess just for testing....it is functional though...if you find the correct order of creation and adds...

    }
}