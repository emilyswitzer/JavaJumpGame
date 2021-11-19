public class SingleTicket extends TicketDecorator{

    Ticket ticket;
    public SingleTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Single";
    }

    public Double getPrice() {
        return 7.00 + ticket.getPrice();
    }
}
