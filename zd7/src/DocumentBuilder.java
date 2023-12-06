// Строитель для документа
class DocumentBuilder {
    private TextContent content;

    public DocumentBuilder() {
        this.content = new TextContent();
    }

    public DocumentBuilder addSection(String title, String content) {
        Section section = new Section(title, content);
        this.content.addSection(section);
        return this;
    }

    public TextContent getContent() {
        return content;
    }

    public Document buildDocument() {
        Document document = new Document();
        document.setContent(this.content);
        return document;
    }
}
