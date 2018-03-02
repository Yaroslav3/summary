package com.summary.summary.repository;

import com.summary.summary.model.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query(value = "SELECT * FROM summary.course WHERE user_id= ?1", nativeQuery = true)
    List<Course> getByIdCourse(Long idUser);
}
