package library_management_system;

public class Library {
	private Book[] books;
    private int count;

    public Library() {
        books = new Book[5];  // Max 5 books
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("Library is full! Cannot add more books.");
        }
    }

    public void issueBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                books[i].issue();
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                books[i].returnBook();
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void listAvailableBooks() {
        System.out.println("\nAvailable Books:");
        boolean anyAvailable = false;
        for (int i = 0; i < count; i++) {
            if (!books[i].isIssued()) {
                books[i].displayInfo();
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No books available.");
        }
    }
}
