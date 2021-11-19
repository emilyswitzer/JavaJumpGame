public class PlaneTicket extends Ticket {

    Ticket ticket;
    public PlaneTicket(){
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Plane";
    }

    public Double getPrice() {
        return 7.00 + ticket.getPrice();
    }
}
