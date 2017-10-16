package social_network.model;

import java.time.LocalDate;

/**
 * @author Igor Hnes on 10/15/17.
 */
public class Event extends AbstractEntity {

    private String name;
    private String description;
    private LocalDate eventDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
}
