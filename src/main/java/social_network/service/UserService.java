package social_network.service;

import social_network.dao.UserDao;
import social_network.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 10/6/17.
 */
public class UserService {

    public List<User> getAll() {
        UserDao userDao = new UserDao();
        return userDao.getAll();
    }
}
