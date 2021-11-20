public class OAPTicket extends TicketDecorator{

    Ticket ticket;
    public OAPTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", OAP";
    }

    public Double getPrice() {
        return ticket.getPrice() + 3.00;
    }
}
