package gr.ots.Services;

import java.util.List;

import gr.ots.Models.MedicineCategory;

public interface CategoryInterface {
    boolean addCategory(MedicineCategory Category);
    MedicineCategory getCategoryById(Long id);
    boolean deleteCategory(Long id);
    List<MedicineCategory> getAllCategories();
}
