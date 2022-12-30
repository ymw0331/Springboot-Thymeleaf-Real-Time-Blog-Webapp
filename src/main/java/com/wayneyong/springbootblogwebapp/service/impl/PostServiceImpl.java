package com.wayneyong.springbootblogwebapp.service.impl;

import com.wayneyong.springbootblogwebapp.dto.PostDto;
import com.wayneyong.springbootblogwebapp.entity.Post;
import com.wayneyong.springbootblogwebapp.mapper.PostMapper;
import com.wayneyong.springbootblogwebapp.repository.PostRepository;
import com.wayneyong.springbootblogwebapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDto> findAllPosts() {
        List<Post> posts = postRepository.findAll();
//        return posts.stream().map((post) -> PostMapper.mapToPostDto(post))
//                .collect(Collectors.toList());
        return posts.stream().map(PostMapper::mapToPostDto).collect(Collectors.toList());
    }

    @Override
    public void createPost(PostDto postDto) {
        Post post = PostMapper.mapToPost(postDto);
        postRepository.save(post);
    }

    @Override
    public PostDto findPostById(Long postId) {
        Post post = postRepository.findById(postId).get();
        return PostMapper.mapToPostDto(post);
    }

    @Override
    public void updatePost(PostDto postDto) {
        Post post = PostMapper.mapToPost(postDto);
        postRepository.save(post);
    }
}
