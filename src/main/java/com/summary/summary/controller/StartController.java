package com.summary.summary.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class StartController {

    @RequestMapping("/start")
    public String show(Model model) {
        model.addAttribute("start", "hello my friend");
        return "start";
    }
}
