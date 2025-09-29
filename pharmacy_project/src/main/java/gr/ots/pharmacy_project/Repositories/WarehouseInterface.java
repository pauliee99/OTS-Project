package gr.ots.Repositories;

import java.util.List;

import gr.ots.Models.Warehouse;

public interface WarehouseInterface {
    boolean addWarehouse(Warehouse Warehouse);
    Warehouse getWarehouseById(Long id);
    boolean deleteWarehouse(Long id);
    List<Warehouse> getAllWarehouses();
}
