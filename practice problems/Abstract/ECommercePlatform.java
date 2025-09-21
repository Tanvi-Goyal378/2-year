// Abstract class Product
abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product: " + name + " (ID: " + productId + "), Price: ₹" + price);
    }
}

// Taxable interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class
class Electronics extends Product implements Taxable {
    private double discountRate; // in percentage
    private static final double TAX_RATE = 0.18; // 18% GST for electronics

    public Electronics(String productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "GST (18%)";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    private double discountAmount; // fixed discount amount
    private static final double TAX_RATE = 0.12; // 12% GST for clothing

    public Clothing(String productId, String name, double price, double discountAmount) {
        super(productId, name, price);
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "GST (12%)";
    }
}

// Groceries class (non-taxable)
class Groceries extends Product {
    private double discountRate;

    public Groceries(String productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }
}

// Main class to demonstrate polymorphism
public class ECommercePlatform {
    public static void printFinalPrice(Product product) {
        product.displayDetails();

        double price = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            Taxable taxable = (Taxable) product;
            tax = taxable.calculateTax();
            System.out.println("Tax Details: " + taxable.getTaxDetails() + ", Tax Amount: ₹" + tax);
        } else {
            System.out.println("No tax applicable.");
        }

        double finalPrice = price + tax - discount;
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Price: ₹" + finalPrice);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Product[] products = {
            new Electronics("E101", "Smartphone", 25000, 10),
            new Clothing("C202", "Jeans", 2000, 150),
            new Groceries("G303", "Rice (5kg)", 1500, 5)
        };

        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}
