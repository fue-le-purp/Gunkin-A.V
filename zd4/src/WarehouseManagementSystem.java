// Интерфейс для системы управления складом (WMS)
interface WarehouseManagementSystem {
    void trackInventory();

    void processOrder(String orderId);
}
