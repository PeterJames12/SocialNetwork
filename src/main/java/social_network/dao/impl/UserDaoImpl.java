package social_network.dao.impl;

import social_network.dao.UserDao;
import social_network.data.Database;
import social_network.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 10/11/17.
 */
public class UserDaoImpl implements UserDao {

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<User> getAll() {
        return Database.getAllUsers();
    }
}
