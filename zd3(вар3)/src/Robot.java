// Реализация устройства - Робот
class Robot implements Device {
    private int speed;

    @Override
    public void turnOn() {
        System.out.println("Робот включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Робот выключен");
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Установлена скорость робота: " + speed);
    }

    @Override
    public void move() {
        System.out.println("Робот двигается со скоростью " + speed);
    }
}
