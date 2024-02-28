public class Megazine extends ReadingMatterial{
    private String editor;

    public Megazine(String title, String isbn, String editor) {
        super(title, isbn);
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
