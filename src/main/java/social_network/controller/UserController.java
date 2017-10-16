package social_network.controller;

import social_network.model.User;
import social_network.service.UserService;
import social_network.service.impl.UserServiceImpl;
import social_network.util.Status;
import social_network.util.University;

import java.util.List;

/**
 * @author Igor Hnes on 10/6/17.
 */
public class UserController {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        final List<User> users = userService.getAll();
        boolean find = userService.findByName("Alex", users);
        System.out.println(find);
        boolean findByUniversity = userService.findByUniversity(University.KPI, users);
        System.out.println(findByUniversity);
        boolean findByAge = userService.findByAge(23,users);
        System.out.println(findByAge);
        boolean isStatusPresent = userService.findByStatus(Status.MARRIED,users);
        System.out.println(isStatusPresent);
    }
}
