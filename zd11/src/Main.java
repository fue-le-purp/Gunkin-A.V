// Главный класс Main
public class Main {
    public static void main(String[] args) {
        // Создание прототипа задачи
        TaskPrototype taskPrototype = new Task("Задача 1", "Описание задачи 1");

        // Создание менеджера задач на основе прототипа
        TaskManager taskManager = new TaskManager(taskPrototype);

        // Клонирование задачи
        TaskPrototype clonedTask = taskManager.cloneTask();

        // Проверка клонированной задачи
        if (clonedTask instanceof Task) {
            Task cloned = (Task) clonedTask;
            System.out.println("Клонированная задача:");
            System.out.println("Название: " + cloned.getName());
            System.out.println("Описание: " + cloned.getDescription());
        }
    }
}
