package social_network.service;

import social_network.model.Event;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Igor Hnes on 10/15/17.
 */
public interface EventService {

    void save(Event event);

    List<Event> getAll();

    List<Event> findByDate(LocalDate date);

    void print(List<Event> events);
}
