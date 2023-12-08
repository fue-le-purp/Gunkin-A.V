import java.util.LinkedList;
import java.util.Queue;

// Главный класс Main
public class Main {
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();

        // Добавление заданий на печать
        printQueue.addToQueue(new PrintJob("Документ 1"));
        printQueue.addToQueue(new PrintJob("Документ 2"));
        printQueue.addToQueue(new PrintJob("Документ 3"));

        // Печать заданий
        printQueue.print(); // Печать задания: Документ 1
        printQueue.print(); // Печать задания: Документ 2
        printQueue.print(); // Печать задания: Документ 3
        printQueue.print(); // Очередь печати пуста
    }
}
