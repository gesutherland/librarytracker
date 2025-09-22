// Book.java
// Represents a single book with basic info

public class book {
    
    // Instance variables (private for encapsulation)
    private String title;
    private String author;
    private int pages;
    private String genre;

    
    // Constructor (full)
    public book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    // Constructor (default)
    public book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.pages = 0;
        this.genre = "None";
    }

    
    // Accessors (getters)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    
    // Mutators (setters)
    public void setPages(int newPages) {
        this.pages = newPages;
    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }

    
    // toString() for pretty printing
    @Override
    public String toString() {
        return title + " by " + author + " (" + genre + ", " + pages + " pages)";
    }
}
