package social_network.service;

import social_network.dao.PostDao;
import social_network.model.Post;

import java.util.List;

/**
 * @author Igor Hnes on 10/7/17.
 */
public class PostService {

    public List<Post> getAll() {
        PostDao postDao = new PostDao();
        return postDao.getAll();
    }

    public void printPosts(List<Post> posts) {
        for (Post post : posts) {
            System.out.println(post.getTitle());
            System.out.println(post.getText());
            System.out.println(post.getPublishedTime());
        }
    }
}
