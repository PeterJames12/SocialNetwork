package social_network.controller;

import social_network.model.Post;
import social_network.model.User;
import social_network.service.PostService;
import social_network.service.impl.PostServiceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Igor Hnes on 10/7/17.
 */
public class PostController {

    public static void main(String[] args) {
        PostService postService = new PostServiceImpl();
        List<Post> posts = postService.getAll();
        postService.printPosts(posts);
        boolean find = postService.findByPublishedTime(LocalDate.now(), posts);
        System.out.println(find);
        boolean isTitlePresent = postService.findByTitle("News", posts);
        System.out.println(isTitlePresent);
    }
}
