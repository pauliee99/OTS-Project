package gr.ots.pharmacy_project.Services;

import gr.ots.pharmacy_project.Models.Warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseService {

    private MedicineService medicineService;
    private final List<Warehouse> warehouseList = new ArrayList<>();
    private int idCounter = 1;

    @Autowired
    public void setMedicineService(MedicineService medicineService) {
        this.medicineService = medicineService;
    }


    public boolean addWarehouse(Warehouse warehouse) {
        warehouse.setId(idCounter++);
        return warehouseList.add(warehouse);
    }

    public Warehouse getWarehouseById(int id) {
        for (Warehouse w : warehouseList) {
            if (w.getId() == id) return w;
        }
        return null;
    }

    public Warehouse deleteWarehouse(int id) {
        for (int i = 0; i < warehouseList.size(); i++) {
            if (warehouseList.get(i).getId() == id) {
                return warehouseList.remove(i);
            }
        }
        return null;
    }

    public List<Warehouse> getAllWarehouses() {
        return new ArrayList<>(warehouseList);
    }

    @PostConstruct
    public void initWarehouses() {
        warehouseList.add(new Warehouse(1, "Main", medicineService.getAllMedicines().get(0), 50, "2025-09-29"));
        warehouseList.add(new Warehouse(1, "Backup", medicineService.getAllMedicines().get(1), 15, "2025-09-29"));
    }
}
