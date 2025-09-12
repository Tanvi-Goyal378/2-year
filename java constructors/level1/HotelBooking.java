public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        HotelBooking hb1 = new HotelBooking();
        HotelBooking hb2 = new HotelBooking("John Doe", "Deluxe", 3);
        HotelBooking hb3 = new HotelBooking(hb2);

        System.out.println("Booking 1: " + hb1.guestName + ", " + hb1.roomType + ", nights: " + hb1.nights);
        System.out.println("Booking 2: " + hb2.guestName + ", " + hb2.roomType + ", nights: " + hb2.nights);
        System.out.println("Booking 3 (copy): " + hb3.guestName + ", " + hb3.roomType + ", nights: " + hb3.nights);
    }
}
