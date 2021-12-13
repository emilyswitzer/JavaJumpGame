package Decorator;

import Decorator.Ticket;
import Decorator.TicketDecorator;

public class ReturnTicket extends TicketDecorator {

    Ticket ticket;
    public ReturnTicket(Ticket ticket){
        this.ticket=ticket;
    }

    public String ticketDesc() {
        return ticket.ticketDesc() + ", Return";
    }

    public Double getPrice() {
        double price = ticket.getPrice();
        double newprice = price*2;
        return newprice;
    }
}
