package Decorator;

import Decorator.Ticket;
import Decorator.TicketDecorator;

public class SingleTicket extends TicketDecorator {

    Ticket ticket;
    public SingleTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Single";
    }

    public Double getPrice() {
        return ticket.getPrice();

    }
}
