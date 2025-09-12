public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean booked;

    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.booked = false;
        this.seatNumber = "";
    }

    public void bookTicket(String seatNumber, double newPrice) {
        if (!booked) {
            this.seatNumber = seatNumber;
            this.price = newPrice;
            this.booked = true;
            System.out.println("Ticket booked successfully.");
        } else {
            System.out.println("Ticket already booked.");
        }
    }

    public void displayDetails() {
        if (booked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers: Endgame", 12.5);
        ticket.displayDetails();
        ticket.bookTicket("A12", 15.0);
        ticket.displayDetails();
    }
}
