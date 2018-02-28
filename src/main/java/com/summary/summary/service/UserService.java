package com.summary.summary.service;

import com.summary.summary.model.User;
import com.summary.summary.repository.StartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {

    @Autowired
    private StartRepository repository;

    public User findById(Long aLong) {
        return repository.findOne(aLong);
    }

    public LocalDateTime createData(LocalDateTime data) {
        return repository.createData(data);
    }
}
