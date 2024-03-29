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
        addMember();
        addBook();
    }

    private void addMember(){
        int newMembersID= myScanObj.nextInt();
        myScanObj.nextLine();
        String newMembersName=myScanObj.nextLine();
        int newMembersMAX_On_Loan=myScanObj.nextInt();
        members.add(new Member(newMembersID,newMembersName,newMembersMAX_On_Loan));
    }

    private void addBook(){
        int newBookID= myScanObj.nextInt();
        myScanObj.nextLine();
        String newBooktitle=myScanObj.nextLine();
        String newBookAuthor=myScanObj.nextLine();
        titles.add(new Book(newBookID,newBooktitle,newBookAuthor));
    }

    private void addBorrowable(Borrowable borrowable){

    }

}
