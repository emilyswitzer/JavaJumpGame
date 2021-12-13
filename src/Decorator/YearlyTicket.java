package Decorator;

import Decorator.Ticket;
import Decorator.TicketDecorator;

public class YearlyTicket extends TicketDecorator {

    Ticket ticket;
    public YearlyTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Yearly";
    }

    public Double getPrice() {
        return ticket.getPrice() +159.00;
    }
}
