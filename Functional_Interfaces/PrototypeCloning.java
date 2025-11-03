class Product implements Cloneable {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

public class PrototypeCloning {
    public static void main(String[] args) {
        Product original = new Product("Laptop", 1200);

        try {
            Product cloned = (Product) original.clone();
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
