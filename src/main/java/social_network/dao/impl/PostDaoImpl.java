package social_network.dao.impl;

import social_network.dao.PostDao;
import social_network.data.Database;
import social_network.model.Post;

import java.util.List;

/**
 * @author Igor Hnes on 10/11/17.
 */
public class PostDaoImpl implements PostDao {

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<Post> getAll() {
        return Database.getAllPosts();
    }
}
