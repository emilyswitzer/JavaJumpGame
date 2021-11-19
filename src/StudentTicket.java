public class StudentTicket extends TicketDecorator{

    Ticket ticket;
    public StudentTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Student";
    }

    public Double getPrice() {
        return 7.00 + ticket.getPrice();
    }
}
