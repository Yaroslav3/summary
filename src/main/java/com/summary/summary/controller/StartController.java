package com.summary.summary.controller;


import com.summary.summary.model.course.Course;
import com.summary.summary.model.user.Photo;
import com.summary.summary.model.user.Site;
import com.summary.summary.model.user.User;
import com.summary.summary.service.CourseService;
import com.summary.summary.service.PhotoService;
import com.summary.summary.service.SiteService;
import com.summary.summary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping()
public class StartController {
    @Autowired
    private UserService userService;

    @Autowired
    private SiteService siteService;

    @Autowired
    private PhotoService photoService;

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/start")
    public String showProfile(Model model) {
        List<String> list = new ArrayList<>();
        List<String> listCourseName = new ArrayList<>();
        List<String> listNameSite = new ArrayList<>();
        User user = userService.findById(1L);
        List<Photo> byPhoto = photoService.findByPhoto(1L);
        List<Site> bySites = siteService.findBySites(1L);

        for (Site elem : bySites) {
            list.add(elem.getSites());
        }
        List<Course> courses = showCourseUser();

        model.addAttribute("user", user);
        model.addAttribute("course", courses);
        model.addAttribute("photo", byPhoto);
        model.addAttribute("site", list);
        model.addAttribute("courses", listCourseName);
        model.addAttribute("site_name", listNameSite);
        return "start";
    }

    private List<Course> showCourseUser() {
        return courseService.getByIdCourse(1L);
    }

    @PostMapping("/course")
    public String show(Model model) {
        model.addAttribute("qwe","123213");
        return "start";
    }
}
