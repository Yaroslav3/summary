package com.summary.summary.service;

import com.summary.summary.model.course.Course;

import java.util.List;


public interface CourseService {

    List<Course> getByIdCourse(Long idUser);
}
