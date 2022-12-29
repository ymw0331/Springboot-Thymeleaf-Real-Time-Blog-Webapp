package com.wayneyong.springbootblogwebapp.repository;

import com.wayneyong.springbootblogwebapp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> { //long is the datatype of primary key == id
    Optional<Post> findByUrl(String url);
}
