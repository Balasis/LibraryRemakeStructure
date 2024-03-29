public class Journal extends Title{
    private String editor;

    public Journal(int id, String title, String editor) {
        super(id, title);
        this.editor = editor;
    }
}
