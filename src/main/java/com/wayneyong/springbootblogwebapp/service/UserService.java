package com.wayneyong.springbootblogwebapp.service;

import com.wayneyong.springbootblogwebapp.dto.RegistrationDto;
import com.wayneyong.springbootblogwebapp.entity.User;

public interface UserService {

    void saveUser(RegistrationDto registrationDto);

    User findByEmail(String email);
}
