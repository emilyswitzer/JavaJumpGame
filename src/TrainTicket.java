public class TrainTicket extends Ticket {

    Ticket ticket;
    public TrainTicket(){
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Train";
    }

    public Double getPrice() {
        return 7.00;
    }
}
