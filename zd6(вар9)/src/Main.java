import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Пример использования системы управления задачами
        SimpleTask simpleTask = new SimpleTask("Написать отчет", "Написать отчет по проекту Х");
        simpleTask.create();
        simpleTask.start();
        simpleTask.complete();

        Event meeting = new Event("Совещание", "Ежедневное совещание", new Date());
        meeting.create();
        meeting.start();

        Project project = new Project("Проект Х");
        project.create();
        project.addTask(simpleTask);
        project.addTask(meeting);
        project.start();
        project.complete();
    }
}
