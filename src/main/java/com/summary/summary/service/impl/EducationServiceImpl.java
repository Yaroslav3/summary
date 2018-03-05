package com.summary.summary.service.impl;


import com.summary.summary.model.education.Education;
import com.summary.summary.repository.EducationRepository;
import com.summary.summary.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {

    @Autowired
    private EducationRepository repository;

    public List<Education> getByEAndEducation(Long id) {
        return repository.getByEAndEducation(id);
    }
}
