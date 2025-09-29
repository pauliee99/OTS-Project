package gr.ots.pharmacy_project.Services;

import gr.ots.pharmacy_project.Models.MedicineCategory;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicineCategoryService {

    private final List<MedicineCategory> categoryList = new ArrayList<>();
    private int idCounter = 1;

    public boolean addCategory(MedicineCategory category) {
        category.setId(idCounter++);
        return categoryList.add(category);
    }

    public MedicineCategory getCategoryById(int id) {
        for (MedicineCategory c : categoryList) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public MedicineCategory deleteCategory(int id) {
        for (int i = 0; i < categoryList.size(); i++) {
            if (categoryList.get(i).getId() == id) {
                return categoryList.remove(i);
            }
        }
        return null;
    }

    public List<MedicineCategory> getAllCategories() {
        return new ArrayList<>(categoryList);
    }

    @PostConstruct
    public void initCategories() {
        categoryList.add(new MedicineCategory(1, "Painkillers"));
        categoryList.add(new MedicineCategory(2, "Antibiotics"));
    }
}
