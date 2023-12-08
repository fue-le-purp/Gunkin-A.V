// Класс, представляющий предмет
class Course implements CurriculumComponent {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void display() {
        System.out.println("Предмет: " + courseName);
    }
}
