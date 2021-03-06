package social_network.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Igor Hnes on 10/6/17.
 */
public class Post extends AbstractEntity {

    private String title;
    private String text;
    private LocalDateTime publishedTime;
    private List<User> usersLike;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(LocalDateTime publishedTime) {
        this.publishedTime = publishedTime;
    }

    public List<User> getUsersLike() {
        return usersLike;
    }

    public void setUsersLike(List<User> usersLike) {
        this.usersLike = usersLike;
    }
}
