package Decorator;

import Decorator.Ticket;

public class PlaneTicket extends Ticket {

    public PlaneTicket(){
    }

    public String ticketDesc() {
        return " Plane";
    }

    public Double getPrice() {
        return 50.00;
    }
}
