// Общий интерфейс для всех типов задач
interface Task {
    void create();

    void start();

    void complete();

    void cancel();
}
