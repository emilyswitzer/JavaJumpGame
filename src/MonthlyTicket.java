public class MonthlyTicket extends TicketDecorator{

    Ticket ticket;
    public MonthlyTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", MonthlyYearly";
    }

    public Double getPrice() {
        return 7.00 + ticket.getPrice();
    }
}
