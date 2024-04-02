import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    private Scanner myScanObj;

    private ArrayList<Borrowable> borrowables;
    private Map<Integer,Member> members;
    private Map<Integer,Title> titles;

    public Library(ArrayList<Borrowable> borrowables , Map<Integer,Title> titles){
        members=new HashMap<Integer,Member>();
        this.borrowables=borrowables;
        this.titles=titles;
   }

    public void addMember(int id, String name){
        members.put(id,new Member(id,name,6));
    }

    public void addTitle(int titleId ,Title title){
        titles.put(titleId,title);
    }

    public void addBorrowable(Borrowable b){
        if (b instanceof BookCopy){
            int bookId=((BookCopy) b).getBookId();
            if (titles.containsKey(bookId)){
               Book book= (Book) titles.get(bookId);
               book.addBookCopy( ((BookCopy) b) );
            }
        }
    borrowables.add(b);
    }

    public void displayAllBorrowables(){
        System.out.println(borrowables);
    }

    public void displayAllMembers(){
        System.out.println(members);
    }

    public void displayBorrowedItems(){
        ArrayList<Borrowable> currentlyBorrowedItems=new ArrayList<Borrowable>();
        for(Borrowable b:borrowables){
            if (!b.isAvailable()){
                currentlyBorrowedItems.add(b);
            }
        }
        System.out.println(currentlyBorrowedItems);
    }

    public Map<Integer,Title> getAllTitles(){
       return titles;
    }

    public Map<Integer,Member> getAllMembers(){
        return members;
    }

}