package com.wayneyong.springbootblogwebapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {

    private Long id;
    @NotEmpty(message = "First name should be empty or null")
    private String firstName;
    @NotEmpty(message = "Last name should be empty or null")
    private String lastName;
    @NotEmpty(message = "Email should be empty or null")
    @Email
    private String email;
    @NotEmpty(message = "Password should be empty or null")
    private String password;

}
