package social_network.data;

import social_network.model.Post;
import social_network.model.User;
import social_network.util.Status;
import social_network.util.University;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 10/7/17.
 */
public class Database {

    public static List<User> getAllUsers() {

        List<User> users = new LinkedList<>();

        User alex = new User();
        alex.setName("Alex");
        alex.setAge(23);
        alex.setStatus(Status.SINGLE);
        alex.setUniversity(University.KPI);

        User ana = new User();
        ana.setName("Ana");
        ana.setAge(33);
        ana.setStatus(Status.SINGLE);
        ana.setUniversity(University.SHEVCHENKA);

        User anton = new User();
        anton.setName("Anton");
        anton.setAge(23);
        anton.setStatus(Status.MARRIED);
        anton.setUniversity(University.KPI);

        users.add(alex);
        users.add(ana);
        users.add(anton);

        return users;
    }

    public static List<Post> getAllPosts() {

        List<Post> posts = new LinkedList<>();

        Post first = new Post();
        first.setTitle("News");
        first.setText("Good news!");
        first.setPublishedTime(LocalDateTime.now());

        Post second = new Post();
        second.setTitle("Sport news");
        second.setText("Win!");
        second.setPublishedTime(LocalDateTime.now());

        Post third = new Post();
        third.setTitle("Whether");
        third.setText("Rain");
        third.setPublishedTime(LocalDateTime.now());

        posts.add(first);
        posts.add(second);
        posts.add(third);

        return posts;
    }
}
