package com.summary.summary.service;

import com.summary.summary.model.education.Education;

import java.util.List;

public interface EducationService {
     List<Education> getByEAndEducation(Long id);
}
