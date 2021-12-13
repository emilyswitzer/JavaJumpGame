package Decorator;

import Decorator.*;

public class TicketReservation {

    public static void main(String[] args) {

        Ticket a = new YearlyTicket(new TrainTicket());
        Ticket b = new SingleTicket(new KidTicket(new BusTicket()));
        Ticket c = new MonthlyTicket(new AdultTicket(new TrainTicket()));
        Ticket d = new YearlyTicket(new OAPTicket(new TrainTicket()));
        Ticket e = new PlaneTicket();

        System.out.println("Decorator.Ticket: " + a.ticketDesc() + " Cost: " + a.getPrice());
        System.out.println("Decorator.Ticket: " + b.ticketDesc() + " Cost: " + b.getPrice());
        System.out.println("Decorator.Ticket: " + c.ticketDesc() + " Cost: " + c.getPrice());
        System.out.println("Decorator.Ticket: " + d.ticketDesc() + " Cost: " + d.getPrice());
        System.out.println("Decorator.Ticket: " + e.ticketDesc() + " Cost: " + e.getPrice());
    }
}
