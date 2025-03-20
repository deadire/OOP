public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Rumaan Adeel", "1234567890", "xyz@gmail.com");
        Cinema cinema = new Cinema("Cineplex", "Township", 3);
        Screen screen1 = new Screen(1, "Inception", 5, 5);
        cinema.addScreen(0, screen1);
        
        screen1.bookSeat(2, 3, customer);
        Ticket ticket = new Ticket(1, customer, 1, 13, "Inception", 15.0);
        
        cinema.displayCinema();
        ticket.displayTicket();
        customer.displayCustomer();
    }
}