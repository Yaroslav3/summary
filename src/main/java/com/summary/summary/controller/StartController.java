package com.summary.summary.controller;


import com.summary.summary.model.User;
import com.summary.summary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping
public class StartController {
    @Autowired
    private UserService repository;

    @RequestMapping("/start")
    public String show(Model model) {
        User user = repository.findById(1l);
        String name = user.getName();
        String surname = user.getSurname();
        String nameUser = name + "  " + surname;
        model.addAttribute("name", nameUser);

        return "start";
    }
}
