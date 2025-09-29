package gr.ots.Services;

import gr.ots.Models.Medicine;
import gr.ots.Repositories.MedicineInterface;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MedicineService implements MedicineInterface {

    private final List<Medicine> medicineList = new ArrayList<>();
    private int idCounter = 1; // auto-increment id

    @Override
    public boolean addMedicine(Medicine medicine) {
        medicine.setId(idCounter++);
        return medicineList.add(medicine);
    }

    @Override
    public Medicine getMedicineById(Long id) {
        Optional<Medicine> med = medicineList.stream()
                .filter(m -> m.getId() == id)
                .findFirst();
        return med.orElse(null);
    }

    @Override
    public boolean deleteMedicine(Long id) {
        return medicineList.removeIf(m -> m.getId() == id);
    }

    @Override
    public List<Medicine> getAllMedicines() {
        return new ArrayList<>(medicineList);
    }
}
