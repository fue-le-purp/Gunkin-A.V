import java.util.ArrayList;
import java.util.List;

// Класс для представления текстового редактора
class TextEditor {
    private List<File> openedFiles;

    public TextEditor() {
        openedFiles = new ArrayList<>();
    }

    public void openFile(File file) {
        openedFiles.add(file);
        System.out.println("Открыт файл: " + file.getFileName());
    }

    public void closeFile(File file) {
        openedFiles.remove(file);
        System.out.println("Закрыт файл: " + file.getFileName());
    }

    public Session saveSession() {
        Session session = new Session();
        session.getOpenedFiles().addAll(openedFiles);
        System.out.println("Сеанс сохранен");
        return session;
    }

    public void restoreSession(Session session) {
        openedFiles.clear();
        openedFiles.addAll(session.getOpenedFiles());
        System.out.println("Сеанс восстановлен");
    }
}
