package Decorator;

public class TrainTicket extends Ticket {

    public String ticketDesc() {
        return " Train";
    }

    public Double getPrice() {
        return 10.00;
    }
}
