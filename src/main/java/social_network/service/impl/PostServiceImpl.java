package social_network.service.impl;

import javafx.geometry.Pos;
import social_network.dao.PostDao;
import social_network.dao.impl.PostDaoImpl;
import social_network.model.Post;
import social_network.service.PostService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Igor Hnes on 10/11/17.
 */
public class PostServiceImpl implements PostService {

    @Override
    public List<Post> getAll() {
        PostDao postDao = new PostDaoImpl();
        return postDao.getAll();
    }

    @Override
    public void printPosts(List<Post> posts) {
        for (Post elem : posts) {
            System.out.println(elem.getTitle());
            System.out.println(elem.getText());
            System.out.println(elem.getPublishedTime());
        }
    }

    @Override
    public boolean findByPublishedTime(LocalDate time, List<Post> posts) {
        for (Post elem : posts)
            if (elem.getPublishedTime().equals(time)) {
                return true;
            }
        return false;
    }

    @Override
    public boolean findByTitle(String title, List<Post> posts) {
        for (Post elem : posts) {
            if (elem.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
}
