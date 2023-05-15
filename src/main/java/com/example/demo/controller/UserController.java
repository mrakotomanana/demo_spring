package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public String all(Model model) {
//        List<User> allPosts = userRepository.findAll();
        List<User> allPosts = new ArrayList<>();
        model.addAttribute("users", allPosts);
        return "user";
    }
}
