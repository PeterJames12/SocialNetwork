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

    public void printUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user.getName());
            System.out.println(user.getAge());
            System.out.println(user.getStatus());
            System.out.println(user.getUniversity());
        }
    }
}
