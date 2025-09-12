public class Book {
    String title;
    String author;
    double price;

    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("1984", "George Orwell", 9.99);

        System.out.println("Book 1: " + b1.title + ", " + b1.author + ", $" + b1.price);
        System.out.println("Book 2: " + b2.title + ", " + b2.author + ", $" + b2.price);
    }
}
