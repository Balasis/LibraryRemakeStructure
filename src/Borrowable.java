public interface Borrowable {
    void borrowItem(Member member);
    void returnItem();
    boolean isAvailable();
    int getId();
}
