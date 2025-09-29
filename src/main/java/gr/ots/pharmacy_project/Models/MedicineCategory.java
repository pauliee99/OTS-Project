package gr.ots.pharmacy_project.Models;

import lombok.Data;

@Data
public class MedicineCategory {
    private int id;
    private String name;
    public MedicineCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
