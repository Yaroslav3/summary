package com.summary.summary.service.impl;

import com.summary.summary.model.user.User;
import com.summary.summary.repository.StartRepository;
import com.summary.summary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private StartRepository repository;

    public User findById(Long aLong) {
        return repository.findOne(aLong);
    }
}
