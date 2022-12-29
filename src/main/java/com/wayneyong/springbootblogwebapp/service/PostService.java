package com.wayneyong.springbootblogwebapp.service;

import com.wayneyong.springbootblogwebapp.dto.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> findAllPosts();

    void createPost(PostDto postDto);

}
