import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class CustomSortECommerce {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200, 4.5, 10),
            new Product("Phone", 800, 4.8, 15),
            new Product("Headphones", 150, 4.2, 20),
            new Product("Monitor", 300, 4.4, 5)
        );

        String campaign = "discount"; // Try: "price", "rating", "discount"

        Comparator<Product> comparator;
        if (campaign.equals("price"))
            comparator = (p1, p2) -> Double.compare(p1.price, p2.price);
        else if (campaign.equals("rating"))
            comparator = (p1, p2) -> Double.compare(p2.rating, p1.rating);
        else
            comparator = (p1, p2) -> Double.compare(p2.discount, p1.discount);

        products.sort(comparator);

        products.forEach(System.out::println);
    }
}
