package com.wayneyong.springbootblogwebapp.controller;

import com.wayneyong.springbootblogwebapp.dto.CommentDto;
import com.wayneyong.springbootblogwebapp.dto.PostDto;
import com.wayneyong.springbootblogwebapp.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BlogController {
    private PostService postService;

    public BlogController(PostService postService) {
        this.postService = postService;
    }

    //handler method to handle http://localhost:8080/
    @GetMapping("/")
    public String viewBlogPosts(Model model) {
        List<PostDto> postsResponse = postService.findAllPosts();
        model.addAttribute("postsResponse", postsResponse);
        return "blog/view_posts";
    }

    //handler method to handle view post request
    @GetMapping("/post/{postUrl}")
    private String showPost(@PathVariable("postUrl") String postUrl,
                            Model model) {
        PostDto post = postService.findPostByUrl(postUrl);

        CommentDto commentDto = new CommentDto();
        model.addAttribute("post", post);
        model.addAttribute("comment", commentDto);
        return "blog/blog_post";
    }


    //handler method to handle blog post search request
    //handler method to handle http://localhost:8080/page/search?query=java
    @GetMapping("/page/search")
    public String searchPost(@RequestParam(value = "query") String query,
                             Model model) {
        List<PostDto> postsResponse = postService.searchPosts(query);
        model.addAttribute("postsResponse", postsResponse);
        return "blog/view_posts";
    }

}
