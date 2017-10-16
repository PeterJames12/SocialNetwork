package social_network.service;

import social_network.dao.UserDao;
import social_network.model.User;

import java.util.List;

/**
 * @author Igor Hnes on 10/6/17.
 */
public interface UserService {

    /**
     * @return list of {@link User} entity.
     */
    List<User> getAll();

    /**
     * Print given list of {@link User}.
     */
    void printUsers(List<User> users);

    /**
     * @return true if given list contains given name.
     */
    boolean findByName(String name, List<User> users);

    /**
     * @return true if given list contains given university.
     */
    boolean findByUniversity(String university, List<User> users);

    /**
     * @return true if given list contains given age.
     */
    boolean findByAge(Integer age, List<User> users);

    /**
     * @return true if given list contains given status.
     */
    boolean findByStatus(String status, List<User> users);
}
