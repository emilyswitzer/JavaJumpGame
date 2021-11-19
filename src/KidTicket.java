public class KidTicket extends TicketDecorator{

    Ticket ticket;
    public KidTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Kid";
    }

    public Double getPrice() {
        return 7.00 + ticket.getPrice();
    }
}
