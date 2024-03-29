import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private Scanner myScanObj;

    private ArrayList<Borrowable> borrowables;
    private ArrayList<Member> members;
    private ArrayList<Title> titles;

    public Library(ArrayList<Borrowable> borrowables , ArrayList<Title> titles){
        members=new ArrayList<Member>();
        this.borrowables=borrowables;
        this.titles=titles;
   }

    public void addMember(int id, String name){
        members.add(new Member(id,name,6));
    }

    public void addTitle(Title t){
        titles.add(t);
    }

    public void addBorrowable(Borrowable b){
    borrowables.add(b);
    }

    public void displayAllMembers(){
        System.out.println(members);
    }

    public void displayAllBorrowables(){
        System.out.println(borrowables);
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


}
