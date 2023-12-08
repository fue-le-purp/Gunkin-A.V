// Класс для управления задачами
class TaskManager {
    private TaskPrototype prototype;

    public TaskManager(TaskPrototype prototype) {
        this.prototype = prototype;
    }

    public TaskPrototype cloneTask() {
        return this.prototype.clone();
    }
}
