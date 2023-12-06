import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Использование паттерна "Строитель" для создания документа
        DocumentBuilder builder = new DocumentBuilder();
        builder.addSection("Введение", "Это введение в документ.");
        builder.addSection("Основная часть", "Это основная часть документа.");
        builder.addSection("Заключение", "Это заключение документа.");

        Document document = builder.buildDocument();
        document.displayDocument();
    }
}
