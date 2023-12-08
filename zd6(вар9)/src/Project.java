import java.util.ArrayList;
import java.util.List;

// Класс для проектов (проект может содержать список задач)
class Project implements Task {
    private String name;
    private List<Task> tasks;

    public Project(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void create() {
        System.out.println("Создан проект: " + name);
    }

    public void start() {
        System.out.println("Проект начат: " + name);
    }

    public void complete() {
        System.out.println("Проект завершен: " + name);
    }

    public void cancel() {
        System.out.println("Проект отменен: " + name);
    }
}
