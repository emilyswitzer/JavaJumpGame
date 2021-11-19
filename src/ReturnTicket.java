public class ReturnTicket extends TicketDecorator{

    Ticket ticket;
    public ReturnTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Return";
    }

    public Double getPrice() {
        return 7.00 + ticket.getPrice();
    }
}
