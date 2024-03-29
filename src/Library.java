import java.util.ArrayList;

public class Library {

    private ArrayList<Borrowable> borrowables;
    private ArrayList<Member> members;
    private ArrayList<Title> titles;

    public Library(ArrayList<Borrowable> borrowables , ArrayList<Title> titles){
        members=new ArrayList<Member>();
        this.borrowables=borrowables;
        this.titles=titles;
    }

}
