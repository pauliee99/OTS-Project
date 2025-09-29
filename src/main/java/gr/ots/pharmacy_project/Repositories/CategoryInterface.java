package gr.ots.pharmacy_project.Repositories;

import java.util.List;

import gr.ots.pharmacy_project.Models.MedicineCategory;

public interface CategoryInterface {
    boolean addCategory(MedicineCategory Category);
    MedicineCategory getCategoryById(Long id);
    boolean deleteCategory(Long id);
    List<MedicineCategory> getAllCategories();
}
