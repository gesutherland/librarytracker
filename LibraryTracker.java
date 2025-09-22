// LibraryTracker.java
// Main class to demonstrate the library tracking system

import java.util.Scanner;

public class LibraryTracker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a new user
        System.out.println(" ");
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        user currentUser = new user(userName);
        
        System.out.println("\nWelcome to Library Tracker, " + userName + "!");

        
        // Main menu loop
        boolean running = true;
        while (running) {
            System.out.println("\n=== LIBRARY TRACKER MENU ===");
            System.out.println("1. Add a book to your shelf");
            System.out.println("2. Remove a book from your shelf");
            System.out.println("3. View your shelf");
            System.out.println("4. Search for a book by title");
            System.out.println("5. Add sample books");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    addBookMenu(scanner, currentUser);
                    break;
                case "2":
                    removeBookMenu(scanner, currentUser);
                    break;
                case "3":
                    currentUser.printShelf();
                    break;
                case "4":
                    searchBookMenu(scanner, currentUser);
                    break;
                case "5":
                    addSampleBooks(currentUser);
                    break;
                case "6":
                    running = false;
                    System.out.println("Thanks for using Library Tracker!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        scanner.close();
    }
    
    // Helper method to add a pause
    private static void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            // Handle interruption gracefully
        }
    }
    
    // Method to add a book
    private static void addBookMenu(Scanner scanner, user currentUser) {
        System.out.println("\n=== ADD A BOOK ===");
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        
        System.out.print("Enter number of pages: ");
        int pages = 0;
        try {
            pages = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid page number. Setting to 0.");
        }
        
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        
        book newBook = new book(title, author, pages, genre);
        currentUser.addBookToShelf(newBook);
        
        System.out.println("Book added successfully!");
        pause(2); // Wait 2 seconds before returning to menu
    }
    
    // Method to remove a book
    private static void removeBookMenu(Scanner scanner, user currentUser) {
        System.out.println("\n=== REMOVE A BOOK ===");
        if (currentUser.getShelfSize() == 0) {
            System.out.println("Your shelf is empty!");
            return;
        }
        
        System.out.print("Enter the title of the book to remove: ");
        String title = scanner.nextLine();
        
        currentUser.removeBookFromShelf(title);
        System.out.println("Book removed (if it existed).");
    }
    
    // Method to search for a book
    private static void searchBookMenu(Scanner scanner, user currentUser) {
        System.out.println("\n=== SEARCH FOR A BOOK ===");
        if (currentUser.getShelfSize() == 0) {
            System.out.println("Your shelf is empty!");
            return;
        }
        
        System.out.print("Enter the title to search for: ");
        String title = scanner.nextLine();
        
        currentUser.searchAndDisplayBook(title);
    }
    
    // Method to add sample books for testing
    private static void addSampleBooks(user currentUser) {
        System.out.println("\n=== ADDING SAMPLE BOOKS ===");
        
        book book1 = new book("To Kill a Mockingbird", "Harper Lee", 376, "Fiction");
        book book2 = new book("1984", "George Orwell", 328, "Dystopian Fiction");
        book book3 = new book("The Great Gatsby", "F. Scott Fitzgerald", 180, "Classic");
        book book4 = new book("Pride and Prejudice", "Jane Austen", 432, "Romance");
        book book5 = new book("The Catcher in the Rye", "J.D. Salinger", 277, "Coming-of-age");
        
        currentUser.addBookToShelf(book1);
        currentUser.addBookToShelf(book2);
        currentUser.addBookToShelf(book3);
        currentUser.addBookToShelf(book4);
        currentUser.addBookToShelf(book5);
        
        System.out.println("Added 5 sample books to your shelf!");
        pause(2); // Wait 2 seconds before returning to menu
    }
}
