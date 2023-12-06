// Реализация устройства - Дрон
class Drone implements Device {
    private int speed;

    @Override
    public void turnOn() {
        System.out.println("Дрон включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Дрон выключен");
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Установлена скорость дрона: " + speed);
    }

    @Override
    public void move() {
        System.out.println("Дрон летит со скоростью " + speed);
    }
}
