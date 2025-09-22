// LibraryDemo.java
// Demo program that matches the example run from the project requirements

public class LibraryDemo {
    
    public static void main(String[] args) {
        // Create a student (using your user class)
        user gabrielle = new user("Gabrielle");
        
        System.out.println("Welcome to " + gabrielle.getName() + "'s Shelf App!");
        
        // Create books
        book hobbit = new book("The Hobbit", "Tolkien", 310, "Fantasy");
        book dune = new book("Dune", "Frank Herbert", 658, "Sci-Fi");
        
        // Add books to shelf
        System.out.println("Adding \"" + hobbit.getTitle() + "\" by " + hobbit.getAuthor() + " (" + hobbit.getPages() + " pages).");
        gabrielle.addBookToShelf(hobbit);
        
        System.out.println("Adding \"" + dune.getTitle() + "\" by " + dune.getAuthor() + " (" + dune.getPages() + " pages).");
        gabrielle.addBookToShelf(dune);
        
        System.out.println();
        System.out.println(gabrielle.getName() + "'s shelf now has " + gabrielle.getShelfSize() + " books.");
        
        // Display books with custom format
        for (book b : gabrielle.getAllBooks()) {
            System.out.println("- " + b.getTitle() + " (" + b.getGenre() + ", " + b.getPages() + " pages)");
        }
        
        System.out.println();
        
        // Change genre using mutator
        System.out.println("Changing " + hobbit.getTitle() + "'s genre from " + hobbit.getGenre() + " → Epic Fantasy.");
        hobbit.setGenre("Epic Fantasy");
        
        // Remove a book
        System.out.println("Removed " + dune.getTitle() + " from the shelf.");
        gabrielle.removeBookFromShelf("Dune");
        
        System.out.println();
        System.out.println(gabrielle.getName() + "'s shelf now has " + gabrielle.getShelfSize() + " book.");
        
        // Display remaining books
        for (book b : gabrielle.getAllBooks()) {
            System.out.println("- " + b.getTitle() + " (" + b.getGenre() + ", " + b.getPages() + " pages)");
        }
    }
}
