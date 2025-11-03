interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("💰 Refunding amount: " + amount);
    }
}

class PayPal implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("💳 Paid " + amount + " via PayPal.");
    }
}

class CreditCard implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("💳 Paid " + amount + " via Credit Card.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("💳 Refunding " + amount + " to Credit Card.");
    }
}

public class PaymentIntegration {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        PaymentProcessor card = new CreditCard();

        paypal.pay(500);
        paypal.refund(200);

        card.pay(1200);
        card.refund(400);
    }
}
