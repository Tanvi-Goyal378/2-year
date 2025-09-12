public class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", "ISBN001");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN002");

        if (b1 instanceof Book) {
            System.out.println("Title: " + b1.title);
            System.out.println("Author: " + b1.author);
            System.out.println("ISBN: " + b1.isbn);
        }

        if (b2 instanceof Book) {
            System.out.println("Title: " + b2.title);
            System.out.println("Author: " + b2.author);
            System.out.println("ISBN: " + b2.isbn);
        }

        displayLibraryName();
    }
}
