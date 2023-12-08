import java.util.LinkedList;
import java.util.Queue;

// Класс для управления очередью печати
class PrintQueue {
    private Queue<PrintJob> queue;

    public PrintQueue() {
        queue = new LinkedList<>();
    }

    public void addToQueue(PrintJob job) {
        queue.add(job);
        System.out.println("Задание добавлено в очередь печати: " + job.getDocument());
    }

    public void print() {
        if (!queue.isEmpty()) {
            PrintJob job = queue.poll();
            System.out.println("Печать задания: " + job.getDocument());
        } else {
            System.out.println("Очередь печати пуста");
        }
    }
}
