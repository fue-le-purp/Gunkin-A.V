// Реализация пульта управления для Дрона
class DroneRemoteControl extends RemoteControl {
    public DroneRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Пульт управления для дрона включен");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Пульт управления для дрона выключен");
        device.turnOff();
    }

    @Override
    public void setSpeed(int speed) {
        device.setSpeed(speed);
    }

    @Override
    public void move() {
        device.move();
    }
}
