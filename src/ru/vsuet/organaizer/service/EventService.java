package ru.vsuet.organaizer.service;

import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.domain.Meeting;
import ru.vsuet.organaizer.repository.InMemoryEventRepository;
import ru.vsuet.organaizer.repository.Repository;
import java.util.List;


public class EventService implements Service<Event> {

    private Repository<Event> repository
            = new InMemoryEventRepository();

    @Override
    public Event getById(Long id) {
        return repository.find(id);
    }

    @Override
    public List<Event> getAll() {
        return repository.list();
    }

    @Override
    public void removeById(Long id) {
        Event target = new Meeting(id,null,"1999-12-01");
        repository.remove(target);

    }


}
