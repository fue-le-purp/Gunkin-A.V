// Тестирование управления устройствами с помощью моста
public class Main {
    public static void main(String[] args) {
        Device robot = new Robot();
        RemoteControl robotRemoteControl = new RobotRemoteControl(robot);

        Device drone = new Drone();
        RemoteControl droneRemoteControl = new DroneRemoteControl(drone);

        // Управление роботом
        robotRemoteControl.turnOn();
        robotRemoteControl.setSpeed(10);
        robotRemoteControl.move();
        robotRemoteControl.turnOff();

        // Управление дроном
        droneRemoteControl.turnOn();
        droneRemoteControl.setSpeed(20);
        droneRemoteControl.move();
        droneRemoteControl.turnOff();
    }
}
