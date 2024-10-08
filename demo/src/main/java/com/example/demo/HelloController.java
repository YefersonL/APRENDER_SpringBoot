package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/create-user")
    public String createUser() {
        User user = new User();
        user.setName("Yeferson");
        user.setDescripcion("Hacer Oficio");
        userRepository.save(user);
        return "User created!";
    }
}
