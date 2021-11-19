public class AdultTicket extends TicketDecorator{

    Ticket ticket;
    public AdultTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ", Adult";
    }

    public Double getPrice() {
        return 7.00;
    }
}
