public class Product {
    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Smartphone", 25000, 2);

        if (p1 instanceof Product) {
            System.out.println("Product ID: " + p1.productID);
            System.out.println("Name: " + p1.productName);
            System.out.println("Price: " + p1.price);
            System.out.println("Quantity: " + p1.quantity);
            System.out.println("Discount: " + discount + "%");
        }

        if (p2 instanceof Product) {
            System.out.println("Product ID: " + p2.productID);
            System.out.println("Name: " + p2.productName);
            System.out.println("Price: " + p2.price);
            System.out.println("Quantity: " + p2.quantity);
            System.out.println("Discount: " + discount + "%");
        }

        updateDiscount(15.0);
        System.out.println("Updated Discount: " + discount + "%");
    }
}
