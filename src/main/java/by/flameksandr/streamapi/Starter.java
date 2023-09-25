package by.flameksandr.streamapi;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("FIrst class", 220));
        tickets.add(new Ticket("Second class", 180));
        tickets.add(new Ticket("Third class", 120));
        tickets.add(new Ticket("Fours class", 20));

        Ticket minimumTicketPrice = tickets.stream().min(Ticket::compare).get();
        Ticket maximumTicketPrice = tickets.stream().max(Ticket::compare).get();

        System.out.println("Min price: " + minimumTicketPrice);
        System.out.println("Max price: " + maximumTicketPrice);
    }
}
