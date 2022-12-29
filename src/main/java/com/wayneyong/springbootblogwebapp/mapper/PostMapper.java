package com.wayneyong.springbootblogwebapp.mapper;

import com.wayneyong.springbootblogwebapp.dto.PostDto;
import com.wayneyong.springbootblogwebapp.entity.Post;

public class PostMapper {

    //convert post entity to postDto
    //convert postDto to post entity

    //map Post entity to PostDtof
    public static PostDto mapToPostDto(Post post) {
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .url(post.getUrl())
                .content(post.getContent())
                .shortDescription(post.getShortDescription())
                .createdOn(post.getCreatedOn())
                .updatedOn(post.getUpdatedOn())
                .build();
    }

    //map PostDto to Post entity
    public static Post mapToPost(PostDto postDto) {
        return Post.builder()
                .id(postDto.getId())
                .title(postDto.getTitle())
                .content(postDto.getContent())
                .url(postDto.getUrl())
                .shortDescription(postDto.getShortDescription())
                .createdOn(postDto.getCreatedOn())
                .updatedOn(postDto.getUpdatedOn())
                .build();
    }
}
