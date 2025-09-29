package gr.ots.Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/medicines")
public class MedicineController {

    private final List<Medicine> medicineList = new ArrayList<>();

    public static class Medicine {
        private String name;
        private int quantity;

        public Medicine() {}
        public Medicine(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }
    }

    @PostMapping("/add")
    public List<Medicine> addMedicine(@RequestBody Medicine medicine) {
        medicineList.add(medicine);
        return medicineList; // Return all medicines after adding
    }

    @GetMapping("/all")
    public List<Medicine> getAllMedicines() {
        return medicineList;
    }

    @PostConstruct
    public void initSampleData() {
        medicineList.add(new Medicine("Paracetamol", 50));
        medicineList.add(new Medicine("Ibuprofen", 30));
    }


}
