package gr.ots.pharmacy_project.Repositories;

import java.util.List;
import gr.ots.pharmacy_project.Models.Medicine;

public interface MedicineInterface {
    boolean addMedicine(Medicine medicine);
    Medicine getMedicineById(int id);
    Medicine deleteMedicine(int id);
    List<Medicine> getAllMedicines();
}
