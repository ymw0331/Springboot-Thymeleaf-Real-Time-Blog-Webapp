package com.wayneyong.springbootblogwebapp.repository;

import com.wayneyong.springbootblogwebapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}


