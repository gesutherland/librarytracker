# Library Tracker

A Java-based personal library tracking system that demonstrates object-oriented programming concepts including constructors, accessors, mutators, and composition.

## 🎯 Project Goals Met

This project demonstrates:
- **Constructors** → Creating Book objects with full and default constructors
- **Accessors** → getTitle(), getPages(), getName(), getShelfSize(), etc.
- **Mutators** → setPages(), setGenre(), addBook(), removeBook(), etc.
- **Composition** → Library class contains ArrayList<Book>, User class contains Library

## 📚 Classes Overview

### `book` Class
- **Instance variables**: title, author, pages, genre (all private)
- **Constructors**: Full constructor and default constructor
- **Accessors**: getTitle(), getAuthor(), getPages(), getGenre()
- **Mutators**: setPages(), setGenre()
- **toString()**: Returns formatted book information

### `library` Class (Composition!)
- **Instance variable**: ArrayList<book> books
- **Constructor**: Starts with empty ArrayList
- **Accessors**: getBookCount(), findBookByTitle(), getAllBooks()
- **Mutators**: addBook(book), removeBook(String title)

### `user` Class (Student equivalent)
- **Instance variables**: name, library shelf (composition)
- **Constructor**: Creates user with empty library
- **Accessors**: getName(), getShelfSize(), getAllBooks()
- **Mutators**: addBookToShelf(book), removeBookFromShelf(String)

## 🚀 How to Run

### Interactive Version
```bash
javac *.java
java LibraryTracker
```

### Demo Version (matches example output)
```bash
javac *.java
java LibraryDemo
```

## 📋 Example Output (LibraryDemo)

```
Welcome to Gabrielle's Shelf App!
Adding "The Hobbit" by Tolkien (310 pages).
Adding "Dune" by Frank Herbert (658 pages).

Gabrielle's shelf now has 2 books.
- The Hobbit (Fantasy, 310 pages)
- Dune (Sci-Fi, 658 pages)

Changing The Hobbit's genre from Fantasy → Epic Fantasy.
Removed Dune from the shelf.

Gabrielle's shelf now has 1 book.
- The Hobbit (Epic Fantasy, 310 pages)
```

## 🔍 Key Features

- **Interactive Menu System** (LibraryTracker.java)
- **Example Demo** (LibraryDemo.java) 
- **Book Management**: Add, remove, search books
- **Genre Updates**: Modify book properties
- **Encapsulation**: All instance variables are private
- **Composition**: Proper "has-a" relationships between classes
