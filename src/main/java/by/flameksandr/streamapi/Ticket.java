package by.flameksandr.streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ticket {
    private String ticketClass;
    private int price;

    public static int compare(Ticket t1, Ticket t2) {
        if (t1.getPrice() > t2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
