package gr.ots.pharmacy_project.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.ots.pharmacy_project.Models.Medicine;
import gr.ots.pharmacy_project.Services.MedicineService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    private MedicineService medicineService;

    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @PostMapping("/add")
    public List<Medicine> addMedicine(@RequestBody Medicine medicine) {
        medicineService.addMedicine(medicine);
        return medicineService.getAllMedicines(); // Return all medicines after adding
    }

    @GetMapping("/all")
    public List<Medicine> getAllMedicines() {
        return medicineService.getAllMedicines();
    }

    @GetMapping("/one")
    public Medicine getOneMedicine(int id) {
        return medicineService.getMedicineById(id);
    }

    @DeleteMapping("/delete")
    public Medicine deleteMedicine(int id) {
        return medicineService.deleteMedicine(id);
    }

}
