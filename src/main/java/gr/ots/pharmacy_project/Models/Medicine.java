package gr.ots.pharmacy_project.Models;

import lombok.Data;

@Data
public class Medicine {
    private int id;
    private String name;
    private String code;
    private double price;
    private int stock;
    private MedicineCategory category;
    public Medicine(int id, String name, String code, double price, int stock, MedicineCategory category) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

}
