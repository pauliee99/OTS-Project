package gr.ots.pharmacy_project.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gr.ots.pharmacy_project.Models.Warehouse;
import gr.ots.pharmacy_project.Services.WarehouseService;

@RestController
@RequestMapping("/warehouses")
public class WarehouseController {

    private WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @PostMapping("/add")
    public List<Warehouse> addWarehouse(@RequestBody Warehouse warehouse) {
        warehouseService.addWarehouse(warehouse);
        return warehouseService.getAllWarehouses();
    }

    @GetMapping("/all")
    public List<Warehouse> getAllWarehouses() {
        return warehouseService.getAllWarehouses();
    }

    @GetMapping("/one")
    public Warehouse getOneWarehouse(@RequestParam Integer id) {
        return warehouseService.getWarehouseById(id);
    }

    @DeleteMapping("/delete")
    public Warehouse deleteWarehouse(@RequestParam Integer id) {
        return warehouseService.deleteWarehouse(id);
    }
}
