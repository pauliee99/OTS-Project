package gr.ots.Models;

import lombok.Data;

@Data
public class Medicine {
    private int id;
    private String name;
    private String code;
    private double price;
    private int stock;
    private int category;
}
