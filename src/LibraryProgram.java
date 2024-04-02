import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LibraryProgram {
    public static void main(String[] args) {
        ArrayList<Borrowable> borrowables=new ArrayList<Borrowable>();
        Map<Integer,Title> titles=new HashMap<Integer,Title>();
        Library lib=new Library(borrowables,titles);
        //There is a mess which I cant really yet define in the BookCopy in order to recreate it
        //from database.Things considering so far are the following:

        //1)Cant use simple the id to recreate the Book which bookcopy belongs since this would
        //cause 2 instances of the same object (since book already exist in the titles)therefore
        //we will have 2 difference references and this could cause issues in our app

        //2)If I  initiate the BookCopies in the method of Book.addBookCopy I need to use a constructor
        //which doesn't call back the Book.addBookCopy, therefore the automated addition to the BookCopy array
        //of book needs to get aborted :/ . Otherwise we would add the same bookcopy twice in the array.(Two constructors ;)

        //3)I assume the whole thing is just becoming complex for no reason. There has to be a more simple method to do this.
        //Also we would need to populate the Borrowable array somehow...and we need to find when its the most appropriate time
        //to do so. Moreover , the way we have it right now in coding if user of this app would like to change the Borrowables
        //or add even more then he can't do it on his own simple because borrowables defined by coding(impliment interface)
        // and not by a changable attribute/field.

        Book book1=new Book(1,"The Who","WhoKnows");
        Book book2=new Book(2,"The What","WhoKnows");
        Journal journal=new Journal(3,"The Which","John Balasis");
        lib.addTitle(1,book1);
        lib.addTitle(2,book2);
        lib.addTitle(3,journal);
        BookCopy myCopy=new BookCopy(1,true,book1);
        lib.addBorrowable(myCopy);
        lib.addMember(1,"Mary");
        myCopy.borrowItem(lib.getAllMembers().getFirst());
        lib.displayAllMembers();
        lib.displayBorrowedItems();

    }
}