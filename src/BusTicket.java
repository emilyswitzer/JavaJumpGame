public class BusTicket extends Ticket {

    Ticket ticket;
    public BusTicket(){
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Bus";
    }

    public Double getPrice() {
        return 7.00 + ticket.getPrice();
    }
}
