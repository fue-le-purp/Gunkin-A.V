// Адаптер для WMS системы A
class WarehouseSystemAAdapter implements WarehouseManagementSystem {
    private WarehouseSystemA systemA;

    public WarehouseSystemAAdapter(WarehouseSystemA systemA) {
        this.systemA = systemA;
    }

    @Override
    public void trackInventory() {
        systemA.checkInventory();
    }

    @Override
    public void processOrder(String orderId) {
        systemA.fulfillOrder(orderId);
    }
}
