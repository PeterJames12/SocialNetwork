package social_network.controller;

import social_network.service.UserService;

/**
 * @author Igor Hnes on 10/6/17.
 */
public class UserController {

    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.getAll();
    }
}
