import java.util.ArrayList;
import java.util.List;

// Класс, представляющий программу обучения или подгруппу предметов
class Program implements CurriculumComponent {
    private String programName;
    private List<CurriculumComponent> components;

    public Program(String programName) {
        this.programName = programName;
        this.components = new ArrayList<>();
    }

    public void addComponent(CurriculumComponent component) {
        components.add(component);
    }

    public void removeComponent(CurriculumComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Программа: " + programName);
        for (CurriculumComponent component : components) {
            component.display();
        }
    }
}
