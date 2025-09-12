public class Book3 {
    public String ISBN;
    protected String title;
    private String author;

    public Book3(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("123456", "Java Programming", "John Smith");
        ebook.display();
        System.out.println("Author: " + ebook.getAuthor());
    }
}

class EBook extends Book3 {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println("ISBN (public): " + ISBN);
        System.out.println("Title (protected): " + title);
    }
}
