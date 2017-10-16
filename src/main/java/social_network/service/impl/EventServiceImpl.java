package social_network.service.impl;

import social_network.dao.EventDao;
import social_network.dao.impl.EventDaoImpl;
import social_network.model.Event;
import social_network.service.EventService;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 10/15/17.
 */
public class EventServiceImpl implements EventService {

    @Override
    public void save(Event event) {
        EventDao eventDao = new EventDaoImpl();
        eventDao.save(event);
    }

    @Override
    public List<Event> getAll() {
        EventDao eventDao = new EventDaoImpl();
        return eventDao.getAll();
    }

    @Override
    public List<Event> findByDate(LocalDate date) {
        List<Event> events = new LinkedList<>();

        List<Event> allEvent = getAll();
        for (Event elem : allEvent) {
            if (elem.getEventDate().equals(date)) {
                events.add(elem);
            }
        }
        return events;
    }

    @Override
    public void print(List<Event> events) {
        for (Event elem : events) {
            System.out.println(elem.getName());
            System.out.println(elem.getDescription());
            System.out.println(elem.getEventDate());
        }
    }
}
