import java.util.ArrayList;
import java.util.List;

// Тестирование системы уведомлений
public class Main {
    public static void main(String[] args) {
        // Создание блога
        Blog blog = new Blog();

        // Создание подписчиков
        BlogSubscriber subscriber1 = new BlogSubscriber("Пользователь 1");
        BlogSubscriber subscriber2 = new BlogSubscriber("Пользователь 2");

        // Подписка на уведомления блога
        blog.subscribe(subscriber1);
        blog.subscribe(subscriber2);

        // Новая публикация в блоге
        blog.publishPost("Новая статья: Как стать успешным программистом");

        // Отписка от уведомлений блога
        blog.unsubscribe(subscriber2);

        // Еще одна публикация в блоге
        blog.publishPost("Обновление: Новые инструменты разработки");

        // Пользователь 2 не получит уведомление о второй публикации, так как он отписался от уведомлений
    }
}
