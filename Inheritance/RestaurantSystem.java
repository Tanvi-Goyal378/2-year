public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Rajeev", 101);
        Waiter waiter = new Waiter("Amit", 202);

        chef.performDuties();
        System.out.println("Name: " + chef.name);
        System.out.println("ID: " + chef.id + "\n");

        waiter.performDuties();
        System.out.println("Name: " + waiter.name);
        System.out.println("ID: " + waiter.id);
    }
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Role: Chef - Preparing meals in the kitchen.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Role: Waiter - Serving customers and taking orders.");
    }
}
