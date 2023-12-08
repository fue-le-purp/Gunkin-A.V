import java.util.ArrayList;
import java.util.List;

// Главный класс Main
public class Main {
    public static void main(String[] args) {
        // Создание предметов
        CurriculumComponent math = new Course("Математика");
        CurriculumComponent physics = new Course("Физика");
        CurriculumComponent literature = new Course("Литература");

        // Создание программ обучения
        Program scienceProgram = new Program("Научная программа");
        scienceProgram.addComponent(math);
        scienceProgram.addComponent(physics);

        Program artsProgram = new Program("Художественная программа");
        artsProgram.addComponent(literature);

        // Создание основной программы обучения, объединяющей программы
        Program mainCurriculum = new Program("Основной учебный план");
        mainCurriculum.addComponent(scienceProgram);
        mainCurriculum.addComponent(artsProgram);

        // Вывод учебного плана
        mainCurriculum.display();
    }
}
