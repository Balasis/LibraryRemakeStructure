public class Member {
    private int id;
    private String name;
    static final int MAX_ON_LOAN=6;

    public Member(String name) {
        this.name = name;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMAX_ON_LOAN() {
        return MAX_ON_LOAN;
    }
}
