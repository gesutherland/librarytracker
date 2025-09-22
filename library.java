// Library.java
// Represents a collection of Books using composition

import java.util.ArrayList;

public class library {
    
    // Instance variable: list of books
    private ArrayList<book> books;

    
    // Constructor
    public library() {
        books = new ArrayList<book>();
    }

    
    // Mutators
    public void addBook(book b) {
        books.add(b);
    }

    public void removeBook(String title) {
        // loop through and remove first matching book
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                break;
            }
        }
    }

    
    // Accessors
    public int getBookCount() {
        return books.size();
    }

    public book findBookByTitle(String title) {
        for (book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null; // not found
    }

    public ArrayList<book> getAllBooks() {
        return books;
    }
}

