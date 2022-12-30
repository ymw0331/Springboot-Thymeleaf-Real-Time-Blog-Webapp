package com.wayneyong.springbootblogwebapp.service;

import com.wayneyong.springbootblogwebapp.dto.CommentDto;

public interface CommentService {
    void createComment(String postUrl, CommentDto commentDto);


}
