package social_network.controller;

import social_network.model.Event;
import social_network.service.EventService;
import social_network.service.impl.EventServiceImpl;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Igor Hnes on 10/15/17.
 */
public class EventController {

    public static void main(String[] args) {

        Event event = new Event();

        event.setName("Test");
        event.setDescription("Test");
        event.setEventDate(LocalDate.now());

        EventService eventService = new EventServiceImpl();
        eventService.save(event);

        final List<Event> all = eventService.getAll();

        final List<Event> byDate = eventService.findByDate(LocalDate.now().minusWeeks(1).minusDays(1));

        eventService.print(all);

        System.out.println("By date");

        eventService.print(byDate);


    }
}
