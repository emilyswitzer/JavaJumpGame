public class AdultTicket extends TicketDecorator{

    Ticket ticket;
    public AdultTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Adult";
    }

    public Double getPrice() {
        return ticket.getPrice() + 10.00;
    }
}
