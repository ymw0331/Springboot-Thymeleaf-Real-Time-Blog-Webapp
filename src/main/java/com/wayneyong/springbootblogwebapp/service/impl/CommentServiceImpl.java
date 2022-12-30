package com.wayneyong.springbootblogwebapp.service.impl;

import com.wayneyong.springbootblogwebapp.dto.CommentDto;
import com.wayneyong.springbootblogwebapp.entity.Comment;
import com.wayneyong.springbootblogwebapp.entity.Post;
import com.wayneyong.springbootblogwebapp.mapper.CommentMapper;
import com.wayneyong.springbootblogwebapp.repository.CommentRepository;
import com.wayneyong.springbootblogwebapp.repository.PostRepository;
import com.wayneyong.springbootblogwebapp.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;
    private PostRepository postRepository;

    public CommentServiceImpl(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void createComment(String postUrl, CommentDto commentDto) {

        Post post = postRepository.findByUrl(postUrl).get();
        Comment comment = CommentMapper.mapToComment(commentDto);
        comment.setPost(post);
        commentRepository.save(comment);
    }
}
