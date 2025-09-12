import java.util.ArrayList;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public static class ShoppingCart {
        private ArrayList<CartItem> items;

        public ShoppingCart() {
            items = new ArrayList<>();
        }

        public void addItem(CartItem item) {
            items.add(item);
            System.out.println(item.getItemName() + " added to cart.");
        }

        public void removeItem(String itemName) {
            boolean removed = items.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
            if (removed) {
                System.out.println(itemName + " removed from cart.");
            } else {
                System.out.println(itemName + " not found in cart.");
            }
        }

        public void displayTotalCost() {
            double total = 0;
            for (CartItem item : items) {
                total += item.getTotalCost();
            }
            System.out.printf("Total Cost: $%.2f\n", total);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Laptop", 999.99, 1));
        cart.addItem(new CartItem("Mouse", 25.50, 2));
        cart.displayTotalCost();
        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}
