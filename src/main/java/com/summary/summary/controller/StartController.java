package com.summary.summary.controller;


import com.summary.summary.model.profile.User;
import com.summary.summary.repository.StartRepository;
import com.summary.summary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class StartController {
    @Autowired
    private UserService repository;

    @RequestMapping("/start")
    public String show(Model model, User user) {
        User byId = repository.findById(1l);
        model.addAttribute("profile", byId);
        return "start";
    }
}
