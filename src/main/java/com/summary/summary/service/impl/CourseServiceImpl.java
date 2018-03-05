package com.summary.summary.service.impl;

import com.summary.summary.model.course.Course;
import com.summary.summary.repository.CourseRepository;
import com.summary.summary.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository repository;

    public List<Course> getByIdCourse(Long idUser) {
        return repository.getByIdCourse(idUser);
    }
}
