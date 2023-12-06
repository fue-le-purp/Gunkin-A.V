// Тестирование системы интеграции
public class Main {
    public static void main(String[] args) {
        // Создание объектов для систем WMS A и B
        WarehouseSystemA systemA = new WarehouseSystemA();
        WarehouseSystemB systemB = new WarehouseSystemB();

        // Создание адаптеров для систем WMS A и B
        WarehouseManagementSystem adapterA = new WarehouseSystemAAdapter(systemA);
        WarehouseManagementSystem adapterB = new WarehouseSystemBAdapter(systemB);

        // Тестирование адаптеров
        System.out.println("Интеграция с системой A:");
        adapterA.trackInventory();
        adapterA.processOrder("123");

        System.out.println("\nИнтеграция с системой B:");
        adapterB.trackInventory();
        adapterB.processOrder("456");
    }
}
