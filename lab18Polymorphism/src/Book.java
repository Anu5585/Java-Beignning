public class Book extends ReadingMatterial{
    private String author;

    public Book(String title, String isbn, String author) {
        super(title, isbn);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
