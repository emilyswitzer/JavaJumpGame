public class WeeklyTicket extends TicketDecorator{

    Ticket ticket;

    public WeeklyTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Weekly";
    }

    public Double getPrice() {
        return ticket.getPrice() + 8.00;
    }
}
