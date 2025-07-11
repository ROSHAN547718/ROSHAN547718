package Day21_LibrarySystem_App;
import java.util.*;

class Book {
    static int counter = 1000; // Auto-incrementing counter for ISBNs
    String title;
    String author;
    String isbn;
    boolean isBorrowed = false;
    User borrowedBy = null;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isbn = generateISBN();
    }

    private String generateISBN() {
        return "ISBN-" + (counter++);
    }

    public String toString() {
        String status = isBorrowed ? "Borrowed by " + borrowedBy.name : "Available";
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + " → " + status;
    }
}

class User {
    String name;
    String userId;
    List<Book> borrowedBooks = new ArrayList<>();

    User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String toString() {
        return "User: " + name + " (ID: " + userId + "), Books Borrowed: " + borrowedBooks.size();
    }
}

public class LibrarySystem {
    static List<Book> books = new ArrayList<>();
    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n📚 Library System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. View All Books");
            System.out.println("4. View All Users");
            System.out.println("5. Search Book by Title");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: addBook(); break;
                case 2: addUser(); break;
                case 3: viewAllBooks(); break;
                case 4: viewAllUsers(); break;
                case 5: searchBook(); break;
                case 6: borrowBook(); break;
                case 7: returnBook(); break;
                case 8: running = false; System.out.println("👋 Exiting..."); break;
                default: System.out.println("❌ Invalid choice.");
            }
        }
    }

    static void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        Book newBook = new Book(title, author);
        books.add(newBook);
        System.out.println("✅ Book added with ISBN: " + newBook.isbn);
    }

    static void addUser() {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();

        users.add(new User(name, userId));
        System.out.println("✅ User added.");
    }

    static void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("📭 No books in the system.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    static void viewAllUsers() {
        if (users.isEmpty()) {
            System.out.println("📭 No users registered.");
        } else {
            for (User u : users) {
                System.out.println(u);
            }
        }
    }

    static void searchBook() {
        System.out.print("Enter title to search: ");
        String title = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (Book b : books) {
            if (b.title.toLowerCase().contains(title)) {
                System.out.println(b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("🔍 No matching book found.");
        }
    }

    static void borrowBook() {
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("❌ User not found.");
            return;
        }

        System.out.print("Enter Book ISBN to borrow: ");
        String isbn = scanner.nextLine();
        Book book = findBookByISBN(isbn);
        if (book == null) {
            System.out.println("❌ Book not found.");
            return;
        }

        if (book.isBorrowed) {
            System.out.println("⚠️ Book already borrowed.");
            return;
        }

        book.isBorrowed = true;
        book.borrowedBy = user;
        user.borrowedBooks.add(book);
        System.out.println("✅ Book borrowed successfully.");
    }

    static void returnBook() {
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("❌ User not found.");
            return;
        }

        System.out.print("Enter Book ISBN to return: ");
        String isbn = scanner.nextLine();
        Book book = findBookByISBN(isbn);
        if (book == null || !book.isBorrowed || book.borrowedBy != user) {
            System.out.println("❌ Invalid return. Either book not borrowed or not by this user.");
            return;
        }

        book.isBorrowed = false;
        book.borrowedBy = null;
        user.borrowedBooks.remove(book);
        System.out.println("✅ Book returned successfully.");
    }

    static Book findBookByISBN(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    static User findUserById(String userId) {
        for (User u : users) {
            if (u.userId.equals(userId)) {
                return u;
            }
        }
        return null;
    }
}