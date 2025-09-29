package gr.ots.pharmacy_project.Models;

import lombok.Data;

@Data
public class Warehouse {
    private int id;
    private String type;
    private Medicine medicine;
    private int quanty;
    private String date;
    public Warehouse(int id, String type, Medicine medicine, int quanty, String date) {
        this.id = id;
        this.type = type;
        this.medicine = medicine;
        this.quanty = quanty;
        this.date = date;
    }
    
}
