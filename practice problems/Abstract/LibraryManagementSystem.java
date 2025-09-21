// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrowerName; // encapsulated borrower data
    private boolean isReserved;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrowerName = null;
    }

    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    protected String getBorrowerName() { return borrowerName; }
    protected void setBorrowerName(String borrowerName) { this.borrowerName = borrowerName; }

    public boolean isReserved() { return isReserved; }
    protected void setReserved(boolean reserved) { isReserved = reserved; }

    public abstract int getLoanDuration(); // duration in days

    public void getItemDetails() {
        System.out.println("ItemID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

// Interface Reservable
interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Book class
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // 3 weeks
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!checkAvailability()) {
            System.out.println("Book already reserved.");
            return false;
        }
        setReserved(false);
        setBorrowerName(borrowerName);
        setReserved(true);
        System.out.println("Book reserved successfully by " + borrowerName);
        return true;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Magazine class
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!checkAvailability()) {
            System.out.println("Magazine already reserved.");
            return false;
        }
        setReserved(false);
        setBorrowerName(borrowerName);
        setReserved(true);
        System.out.println("Magazine reserved successfully by " + borrowerName);
        return true;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!checkAvailability()) {
            System.out.println("DVD already reserved.");
            return false;
        }
        setReserved(false);
        setBorrowerName(borrowerName);
        setReserved(true);
        System.out.println("DVD reserved successfully by " + borrowerName);
        return true;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Main class to demonstrate polymorphism
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Magazine("M001", "National Geographic", "Various"),
            new DVD("D001", "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                boolean available = reservableItem.checkAvailability();
                System.out.println("Available for reservation? " + available);

                if (available) {
                    reservableItem.reserveItem("John Doe");
                } else {
                    System.out.println("Item is already reserved.");
                }
            }
            System.out.println("----------------------");
        }
    }
}
