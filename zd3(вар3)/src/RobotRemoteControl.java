// Реализация пульта управления для Робота
class RobotRemoteControl extends RemoteControl {
    public RobotRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Пульт управления для робота включен");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Пульт управления для робота выключен");
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
