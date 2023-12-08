// Абстрактный класс, определяющий базовую реализацию методов
abstract class AbstractTask implements Task {
    private String name;
    private String description;
    private boolean isStarted;
    private boolean isCompleted;

    public AbstractTask(String name, String description) {
        this.name = name;
        this.description = description;
        this.isStarted = false;
        this.isCompleted = false;
    }

    public void create() {
        System.out.println("Создана задача: " + name);
    }

    public void start() {
        if (!isStarted) {
            isStarted = true;
            System.out.println("Задача начата: " + name);
        } else {
            System.out.println("Задача уже начата: " + name);
        }
    }

    public void complete() {
        if (isStarted && !isCompleted) {
            isCompleted = true;
            System.out.println("Задача завершена: " + name);
        } else {
            System.out.println("Невозможно завершить задачу: " + name);
        }
    }

    public void cancel() {
        if (!isCompleted) {
            isStarted = false;
            System.out.println("Задача отменена: " + name);
        } else {
            System.out.println("Невозможно отменить завершенную задачу: " + name);
        }
    }
}
