public abstract class Ticket {

    private int ticketCode;
    private Double price;

    public Ticket(){

    }

    public abstract Double getPrice();
    public String ticketDesc(){
        return "Ticket Code: " + this.ticketCode + ", Price: " + this.getPrice();
    }

}

