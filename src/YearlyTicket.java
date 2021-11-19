public class YearlyTicket extends TicketDecorator{

    Ticket ticket;
    public YearlyTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Yearly";
    }

    public Double getPrice() {
        return 7.00 + ticket.getPrice();
    }
}
