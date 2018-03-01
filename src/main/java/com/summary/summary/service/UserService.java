package com.summary.summary.service;

import com.summary.summary.model.user.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User findById(Long aLong);
}
