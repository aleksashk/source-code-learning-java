package by.flameksandr.streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Computer {
    private String type;
    private String company;
    private String model;
    private int price;
}
