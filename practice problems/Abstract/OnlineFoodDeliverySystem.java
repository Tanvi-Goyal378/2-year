// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price >= 0 ? price : 0;
        this.quantity = quantity >= 0 ? quantity : 0;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        if (quantity >= 0) this.quantity = quantity;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: ₹" + price + ", Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

// Interface Discountable
interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discountPercentage;
    private double discountedPrice;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountPercentage = 0;
        this.discountedPrice = price;
    }

    @Override
    public double calculateTotalPrice() {
        double total = discountedPrice * getQuantity();
        return total;
    }

    @Override
    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            discountPercentage = percentage;
            discountedPrice = getPrice() * (1 - percentage / 100);
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercentage + "%";
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge = 20; // Fixed additional charge per item for non-veg
    private double discountPercentage;
    private double discountedPrice;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountPercentage = 0;
        this.discountedPrice = price + additionalCharge;
    }

    @Override
    public double calculateTotalPrice() {
        double total = discountedPrice * getQuantity();
        return total;
    }

    @Override
    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            discountPercentage = percentage;
            discountedPrice = (getPrice() + additionalCharge) * (1 - percentage / 100);
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercentage + "%";
    }
}

// Main class demonstrating polymorphism
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Tikka", 150, 2),
            new NonVegItem("Chicken Biryani", 250, 1),
            new VegItem("Veg Fried Rice", 120, 3),
            new NonVegItem("Fish Curry", 300, 1)
        };

        // Apply some discounts
        ((Discountable) order[0]).applyDiscount(10); // 10% on Paneer Tikka
        ((Discountable) order[1]).applyDiscount(5);  // 5% on Chicken Biryani

        double totalOrderPrice = 0;

        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                System.out.println(discountable.getDiscountDetails());
            }
            System.out.println("Total Price: ₹" + item.calculateTotalPrice());
            System.out.println("--------------------");
            totalOrderPrice += item.calculateTotalPrice();
        }

        System.out.println("Final Order Total: ₹" + totalOrderPrice);
    }
}
