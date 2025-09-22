// User.java
// Represents a user who has their own personal Library

public class user {
    
    private String name;
    private library shelf;   // composition: User HAS a Library

    
    // Constructor
    public user(String name) {
        this.name = name;
        this.shelf = new library(); // empty shelf to start
    }

    
    // Accessors
    public String getName() {
        return name;
    }

    public int getShelfSize() {
        return shelf.getBookCount();
    }

    
    // Mutators (wrappers around Library methods)
    public void addBookToShelf(book b) {
        shelf.addBook(b);
    }

    public void removeBookFromShelf(String title) {
        shelf.removeBook(title);
    }

    
    // Display the shelf contents
    public void printShelf() {
        System.out.println(name + "'s shelf (" + getShelfSize() + " books):");
        for (book b : shelf.getAllBooks()) {
            System.out.println(" - " + b.toString());
        }
        System.out.println();
    }
    
    // Search for a book by title
    public book findBook(String title) {
        return shelf.findBookByTitle(title);
    }
    
    // Get all books (accessor for the underlying library)
    public java.util.ArrayList<book> getAllBooks() {
        return shelf.getAllBooks();
    }
    
    // Display search results
    public void searchAndDisplayBook(String title) {
        book found = findBook(title);
        if (found != null) {
            System.out.println("Found: " + found.toString());
        } else {
            System.out.println("Book not found: " + title);
        }
    }
}  

