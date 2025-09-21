public class OrderManagement {
    public static void main(String[] args) {
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD123", "2025-09-20", "TRK789", "2025-09-21");
        System.out.println("Order ID: " + deliveredOrder.orderId);
        System.out.println("Order Date: " + deliveredOrder.orderDate);
        System.out.println("Tracking Number: " + deliveredOrder.trackingNumber);
        System.out.println("Delivery Date: " + deliveredOrder.deliveryDate);
        System.out.println("Order Status: " + deliveredOrder.getOrderStatus());
    }
}

class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

