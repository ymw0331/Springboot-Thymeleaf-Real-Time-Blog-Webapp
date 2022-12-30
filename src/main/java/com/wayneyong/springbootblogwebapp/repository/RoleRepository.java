package com.wayneyong.springbootblogwebapp.repository;

import com.wayneyong.springbootblogwebapp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
