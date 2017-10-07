package social_network.controller;

import social_network.model.Post;
import social_network.service.PostService;

import java.util.List;

/**
 * @author Igor Hnes on 10/7/17.
 */
public class PostController {

    public static void main(String[] args) {
        PostService postService = new PostService();
        final List<Post> all = postService.getAll();
        postService.printPosts(all);
    }
}
