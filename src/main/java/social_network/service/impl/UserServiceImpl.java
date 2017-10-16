package social_network.service.impl;

import social_network.dao.UserDao;
import social_network.dao.impl.UserDaoImpl;
import social_network.model.User;
import social_network.service.UserService;

import java.util.List;

/**
 * Implementation of {@link UserService} interface.
 *
 * @author Igor Hnes on 10/11/17.
 */
public class UserServiceImpl implements UserService {

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<User> getAll() {
        UserDao userDao = new UserDaoImpl();
        return userDao.getAll();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void printUsers(List<User> users) {
        for (User elem : users) {
            System.out.println(elem.getName());
            System.out.println(elem.getAge());
            System.out.println(elem.getStatus());
            System.out.println(elem.getUniversity());
        }
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean findByName(String name, List<User> users) {
        for (User elem : users) {
            if (elem.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean findByUniversity(String university, List<User> users) {
        for (User elem : users) {
            if (elem.getUniversity().equals(university)) {
                return true;
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean findByAge(Integer age, List<User> users) {
        for (User elem : users) {
            if (elem.getAge() == age) {
                return true;
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean findByStatus(String status, List<User> users) {
        for (User elem : users) {
            if (elem.getStatus().equals(status)) {
                return true;
            }
        }
        return false;
    }
}
