public abstract class Ticket {

    private int ticketCode;

    public Ticket(){

    }
    public int getTicketCode() {
        return ticketCode;
    }

    public abstract String ticketDesc();
    public abstract Double getPrice();

}

