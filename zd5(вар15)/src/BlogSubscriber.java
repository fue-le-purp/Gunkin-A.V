// Класс подписчика, который получает уведомления о новых записях
class BlogSubscriber implements Subscriber {
    private String name;

    public BlogSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " получил уведомление: " + message);
    }
}
