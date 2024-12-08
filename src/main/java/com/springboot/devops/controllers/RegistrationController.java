package com.springboot.devops.controllers;

import com.springboot.devops.entity.MyUser;
import com.springboot.devops.repository.MyUserRepository;
import com.springboot.devops.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Utility.base_url)
public class RegistrationController {
    @Autowired
private MyUserRepository myUserRepository;
@Autowired
private PasswordEncoder passwordEncoder;

@PostMapping("/register/user")
public MyUser createUser(@RequestBody MyUser user) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    return myUserRepository.save(user);
}
}
