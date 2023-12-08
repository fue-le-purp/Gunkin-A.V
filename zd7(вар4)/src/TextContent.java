import java.util.ArrayList;
import java.util.List;

// Класс для текстового содержания документа
class TextContent {
    private List<Section> sections;

    public TextContent() {
        this.sections = new ArrayList<>();
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public List<Section> getSections() {
        return sections;
    }
}
