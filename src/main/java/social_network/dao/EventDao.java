package social_network.dao;

import social_network.model.Event;

import javax.swing.text.html.parser.Entity;
import java.util.List;

/**
 * @author Igor Hnes on 10/15/17.
 */
public interface EventDao {

    List<Event> getAll();

    void save(Event event);

}
