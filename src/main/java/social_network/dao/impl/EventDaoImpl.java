package social_network.dao.impl;

import social_network.dao.EventDao;
import social_network.data.Database;
import social_network.model.Event;

import java.util.List;

/**
 * @author Igor Hnes on 10/15/17.
 */
public class EventDaoImpl implements EventDao {

    @Override
    public List<Event> getAll() {
        return Database.getAllEvents();
    }

    @Override
    public void save(Event event) {

        Database.save(event);
    }
}
