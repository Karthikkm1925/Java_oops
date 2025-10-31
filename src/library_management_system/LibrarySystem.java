package library_management_system;

public class LibrarySystem {
	public static void main(String[] args) {
        Library lib = new Library();

        // Adding books
        lib.addBook(new Book(1, "The Alchemist", "Paulo Coelho"));
        lib.addBook(new Book(2, "1984", "George Orwell"));
        lib.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
        lib.addBook(new Book(4, "Sapiens", "Yuval Noah Harari"));
        lib.addBook(new Book(5, "Clean Code", "Robert C. Martin"));

        // List available
        lib.listAvailableBooks();

        // Issue a book
        lib.issueBook(3);
        lib.issueBook(5);

        // Try issuing again
        lib.issueBook(3);

        // List available
        lib.listAvailableBooks();

        // Return a book
        lib.returnBook(3);

        // List again
        lib.listAvailableBooks();
    }
}
