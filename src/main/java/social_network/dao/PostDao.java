package social_network.dao;

import social_network.data.Database;
import social_network.model.Post;

import java.util.List;

/**
 * @author Igor Hnes on 10/7/17.
 */
public class PostDao {

    public List<Post> getAll() {
       return Database.getAllPosts();
    }
}
