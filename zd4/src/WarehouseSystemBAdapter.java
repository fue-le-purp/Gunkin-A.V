// Адаптер для WMS системы B
class WarehouseSystemBAdapter implements WarehouseManagementSystem {
    private WarehouseSystemB systemB;

    public WarehouseSystemBAdapter(WarehouseSystemB systemB) {
        this.systemB = systemB;
    }

    @Override
    public void trackInventory() {
        systemB.getInventoryStatus();
    }

    @Override
    public void processOrder(String orderId) {
        systemB.handleOrder(orderId);
    }
}
