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

        //adding a member test
        int newMembersID= myScanObj.nextInt();
        myScanObj.nextLine();
        String newMembersName=myScanObj.nextLine();
        int newMembersMAX_On_Loan=myScanObj.nextInt();
        addMember(newMembersID,newMembersName);


        //adding a Title test
        int newBookID= myScanObj.nextInt();
        myScanObj.nextLine();
        String newBooktitle=myScanObj.nextLine();
        String newBookAuthor=myScanObj.nextLine();
        Book testingBook=new Book(newBookID,newBooktitle,newBookAuthor);
        addTitle(testingBook);



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
