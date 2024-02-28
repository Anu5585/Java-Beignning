public class Novel extends Book{
    private String characters;

    public Novel(String title, String isbn, String author, String characters) {
        super(title, isbn, author);
        this.characters = characters;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }
}
