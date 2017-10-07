package social_network.controller;

import social_network.model.User;
import social_network.service.UserService;

import java.util.List;

/**
 * @author Igor Hnes on 10/6/17.
 */
public class UserController {

    public static void main(String[] args) {

        UserService userService = new UserService();
        final List<User> all = userService.getAll();

        userService.printUsers(all);
    }
}
