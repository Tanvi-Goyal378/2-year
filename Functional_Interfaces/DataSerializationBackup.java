import java.io.*;

class Customer implements Serializable {
    String name;
    int id;

    Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Customer{name='" + name + "', id=" + id + "}";
    }
}

public class DataSerializationBackup {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", 101);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customer_backup.dat"))) {
            oos.writeObject(customer);
            System.out.println("✅ Customer serialized for backup.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer_backup.dat"))) {
            Customer restored = (Customer) ois.readObject();
            System.out.println("🔄 Restored: " + restored);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

