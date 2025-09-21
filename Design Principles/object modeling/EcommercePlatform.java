import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in the order:");
        for (Product p : products) {
            System.out.println("- " + p.getName() + ": $" + p.getPrice());
        }
        System.out.println("Total Price: $" + calculateTotal());
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void showOrders() {
        System.out.println("Orders for customer: " + name);
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println("-----------------------");
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        // Create Products
        Product laptop = new Product("Laptop", 999.99);
        Product mouse = new Product("Wireless Mouse", 25.50);
        Product keyboard = new Product("Mechanical Keyboard", 75.00);

        // Create Customer
        Customer customer = new Customer("John Doe");

        // Create Orders
        Order order1 = new Order(101);
        order1.addProduct(laptop);
        order1.addProduct(mouse);

        Order order2 = new Order(102);
        order2.addProduct(keyboard);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Show customer orders and details
        customer.showOrders();
    }
}
