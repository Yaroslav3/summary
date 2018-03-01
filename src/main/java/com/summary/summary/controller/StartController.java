package com.summary.summary.controller;


import com.summary.summary.model.user.Photo;
import com.summary.summary.model.user.Site;
import com.summary.summary.model.user.User;
import com.summary.summary.service.PhotoService;
import com.summary.summary.service.SiteService;
import com.summary.summary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class StartController {
    @Autowired
    private UserService userService;

    @Autowired
    private SiteService siteService;

    @Autowired
    private PhotoService photoService;

    @RequestMapping(value = "/start", method = RequestMethod.POST)
    public String showProfile(Model model) {
        List<String> list = new ArrayList<>();
        User user = userService.findById(1L);
        List<Photo> byPhoto = photoService.findByPhoto(1L);

        List<Site> bySites = siteService.findBySites(1L);
        for (Site elem : bySites) {
            list.add(elem.getSites());
        }

        String phone = user.getPhone();
        String name = user.getName();
        String surname = user.getSurname();
        String nameUser = name + "  " + surname;
        String data = user.getData();
        String nationality = user.getNationality();
        String email = user.getEmail();

        model.addAttribute("user", user);
        model.addAttribute("photo", byPhoto);
        model.addAttribute("name", nameUser);
        model.addAttribute("data", data);
        model.addAttribute("phone", phone);
        model.addAttribute("nationality", nationality);
        model.addAttribute("email", email);
        model.addAttribute("site", list);

        return "start";
    }

    @RequestMapping(value = "/course", method = RequestMethod.POST)
    public String showCourse(Model model) {
        model.addAttribute("qwe", "wqewe");
        return "start";
    }
}
