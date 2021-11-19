public class TicketReservation {

    public static void main(String[] args) {

        Ticket t = new YearlyTicket(new AdultTicket(new TrainTicket()));

        System.out.println(t + " :Cost = " + t.getPrice());
    }
}
