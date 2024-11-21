
public class Main {

    public static void main(String[] args) {

        Library myLibrary = new Library("CENTRAL Library");
        LibraryBranch branch1 = new LibraryBranch("Karachi-East Branch");
        LibraryBranch branch2 = new LibraryBranch("Karachi-West Branch");
        myLibrary.addBranch(branch1);
        myLibrary.addBranch(branch2);
        Book book1 = new Book("Asan Urdu", "Mirza Galib", "1234");
        Book book2 = new Book("Tiger in a Cage", "Moonty", "5678");
        branch1.addBook(book1);
        branch1.addBook(book2);
        branch1.displayBooks();
        myLibrary.displayBranches();
        branch1.removeBook("1234");
        branch1.displayBooks();

    }
}