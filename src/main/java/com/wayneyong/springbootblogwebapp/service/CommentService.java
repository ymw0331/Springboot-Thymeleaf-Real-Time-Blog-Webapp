package com.wayneyong.springbootblogwebapp.service;

import com.wayneyong.springbootblogwebapp.dto.CommentDto;

import java.util.List;

public interface CommentService {
    void createComment(String postUrl, CommentDto commentDto);

    List<CommentDto> findAllComments();

    void deleteComment(Long commentId);


}
