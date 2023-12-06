import java.util.ArrayList;
import java.util.List;

// Класс для представления сеанса работы
class Session {
    private List<File> openedFiles;

    public Session() {
        openedFiles = new ArrayList<>();
    }

    public void addFile(File file) {
        openedFiles.add(file);
    }

    public List<File> getOpenedFiles() {
        return openedFiles;
    }
}
