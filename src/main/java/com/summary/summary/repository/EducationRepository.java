package com.summary.summary.repository;

import com.summary.summary.model.education.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {

    @Query(value = "SELECT * FROM  summary.education WHERE user_id=?1", nativeQuery = true)
    List<Education> getByEAndEducation(Long id);
}
