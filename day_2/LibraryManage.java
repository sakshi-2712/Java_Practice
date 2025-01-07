class Book {
    String title;
    String author;
    String ISBN;
    boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You have returned the book: " + title);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

class Library {
    Book[] books;
    int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books available in the library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                books[i].displayDetails();
                System.out.println();   
            }
        }
    }


    public void borrowBook(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].ISBN.equals(ISBN)) {
                books[i].borrow();
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }
    public void returnBook(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].ISBN.equals(ISBN)) {
                books[i].returnBook();
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }
}

public class LibraryManage {
    public static void main(String[] args) {

        Book book1 = new Book("secret", "abc", "1234567890");
        Book book2 = new Book("kill", "xyz", "9876543210");
        Book book3 = new Book("story", "abc", "1122334455");

        Library library = new Library(5);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Books in Library:");
        library.displayAllBooks();

        library.borrowBook("1234567890");
        library.returnBook("1234567890");

        System.out.println("\nBooks in Library after borrowing and returning:");
        library.displayAllBooks();
    }
}
