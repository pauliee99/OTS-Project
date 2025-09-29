package gr.ots.pharmacy_project.Services;

import gr.ots.pharmacy_project.Models.Medicine;
import gr.ots.pharmacy_project.Models.MedicineCategory;
import gr.ots.pharmacy_project.Repositories.MedicineInterface;
import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicineService implements MedicineInterface {

    private MedicineCategoryService categoryService;
    private final List<Medicine> medicineList = new ArrayList<>();
    private int idCounter = 1;

    @Autowired
    public void setCategoryService(MedicineCategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public boolean addMedicine(Medicine medicine) {
        medicine.setId(idCounter++);
        return medicineList.add(medicine);
    }

    @Override
    public Medicine getMedicineById(int id) {
        for (int i = 0; i < medicineList.size(); i++) {
            if (medicineList.get(i).getId() == id) {
                return medicineList.get(i);
            }
        }
        return null;
    }

    @Override
    public Medicine deleteMedicine(int id) {
        for (int i = 0; i < medicineList.size(); i++) {
            if (medicineList.get(i).getId() == id) {
                medicineList.remove(i);
                return medicineList.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Medicine> getAllMedicines() {
        return new ArrayList<>(medicineList);
    }

    @PostConstruct
    public void initMedicines() {
        MedicineCategory painkillers = categoryService.getAllCategories().get(0);
        MedicineCategory antibiotics = categoryService.getAllCategories().get(1);
        medicineList.add(new Medicine(1, "Panatol", "Test", 13.5, 5, painkillers));
        medicineList.add(new Medicine(2, "Algofren", "Test2", 12.5, 5, antibiotics));
    }
}
