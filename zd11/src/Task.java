// Класс, представляющий задачу
class Task implements TaskPrototype {
    private String name;
    private String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public Task clone() {
        return new Task(this.name, this.description);
    }
}
