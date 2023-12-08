import java.util.List;

// Класс, представляющий сам документ
class Document {
    private TextContent content;

    public void setContent(TextContent content) {
        this.content = content;
    }

    public void displayDocument() {
        List<Section> sections = content.getSections();
        for (Section section : sections) {
            System.out.println("Title: " + section.getTitle());
            System.out.println("Content: " + section.getContent());
            System.out.println("---------------------");
        }
    }
}
