package com.summary.summary.service;

import com.summary.summary.model.profile.User;
import com.summary.summary.repository.StartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private StartRepository repository;

    public User findById(Long aLong) {
        return repository.findOne(aLong);
    }
}
