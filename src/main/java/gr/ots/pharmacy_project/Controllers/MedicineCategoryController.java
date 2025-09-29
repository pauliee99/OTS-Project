package gr.ots.pharmacy_project.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gr.ots.pharmacy_project.Models.MedicineCategory;
import gr.ots.pharmacy_project.Services.MedicineCategoryService;

@RestController
@RequestMapping("/categories")
public class MedicineCategoryController {

    private MedicineCategoryService categoryService;

    public MedicineCategoryController(MedicineCategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/add")
    public List<MedicineCategory> addCategory(@RequestBody MedicineCategory category) {
        categoryService.addCategory(category);
        return categoryService.getAllCategories();
    }

    @GetMapping("/all")
    public List<MedicineCategory> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/one")
    public MedicineCategory getOneCategory(@RequestParam Integer id) {
        return categoryService.getCategoryById(id);
    }

    @DeleteMapping("/delete")
    public MedicineCategory deleteCategory(@RequestParam Integer id) {
        return categoryService.deleteCategory(id);
    }
}
