public class OAPTicket extends TicketDecorator{

    Ticket ticket;
    public OAPTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", OAP";
    }

    public Double getPrice() {
        return 7.00 + ticket.getPrice();
    }
}
