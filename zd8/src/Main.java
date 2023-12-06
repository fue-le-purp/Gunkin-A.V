import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем объект текстового редактора
        TextEditor textEditor = new TextEditor();

        // Открываем несколько файлов
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        textEditor.openFile(file1);
        textEditor.openFile(file2);

        // Сохраняем текущий сеанс работы
        Session savedSession = textEditor.saveSession();

        // Закрываем файлы и открываем сеанс снова из сохранения
        textEditor.closeFile(file1);
        textEditor.closeFile(file2);

        textEditor.restoreSession(savedSession);
    }
}
