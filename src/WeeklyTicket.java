public class WeeklyTicket extends TicketDecorator{

    Ticket ticket;

    public WeeklyTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Weekly";
    }

    public Double getPrice() {
        return 7.00 + ticket.getPrice();
    }
}
