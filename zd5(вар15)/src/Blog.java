import java.util.ArrayList;
import java.util.List;

// Класс блога, который отправляет уведомления подписчикам
class Blog {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestPost = ""; // Последняя публикация блога

    // Подписка на уведомления о новых записях в блоге
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Отписка от уведомлений блога
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Оповещение подписчиков о новой публикации
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update("Новая запись в блоге: " + latestPost);
        }
    }

    // Добавление новой записи в блог
    public void publishPost(String postContent) {
        this.latestPost = postContent;
        notifySubscribers();
    }
}
