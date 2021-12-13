package Decorator;

import Decorator.Ticket;
import Decorator.TicketDecorator;

public class StudentTicket extends TicketDecorator {

    Ticket ticket;
    public StudentTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Student";
    }

    public Double getPrice() {
        return ticket.getPrice() - 5.00;
    }
}
