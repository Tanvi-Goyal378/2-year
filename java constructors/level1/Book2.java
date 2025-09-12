public class Book2 {
    String title;
    String author;
    double price;
    boolean available;

    Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    boolean borrow() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Book2 b = new Book2("1984", "George Orwell", 9.99);

        System.out.println("Borrowing book first time: " + b.borrow()); // true
        System.out.println("Borrowing book second time: " + b.borrow()); // false
    }
}
