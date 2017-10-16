package social_network.service;

import social_network.dao.PostDao;
import social_network.model.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Igor Hnes on 10/7/17.
 */
public interface PostService {

    List<Post> getAll();

    void printPosts(List<Post> posts);

    boolean findByPublishedTime(LocalDate time, List<Post> posts);

    boolean findByTitle(String title, List<Post> posts);
}
