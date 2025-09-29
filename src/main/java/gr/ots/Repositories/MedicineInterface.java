package gr.ots.Repositories;

import java.util.List;
import gr.ots.Models.Medicine;

public interface MedicineInterface {
    boolean addMedicine(Medicine medicine);
    Medicine getMedicineById(Long id);
    boolean deleteMedicine(Long id);
    List<Medicine> getAllMedicines();
}
