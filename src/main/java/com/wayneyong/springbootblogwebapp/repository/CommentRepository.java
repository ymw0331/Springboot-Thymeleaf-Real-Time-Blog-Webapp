package com.wayneyong.springbootblogwebapp.repository;

import com.wayneyong.springbootblogwebapp.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {


}
