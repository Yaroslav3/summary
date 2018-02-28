package com.summary.summary.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class UpdateController {

    @RequestMapping("/update")
    public String start(Model model) {
        model.addAttribute("update", "hello my friend");
        return "update";
    }
}
