package com.summary.summary.service;

import com.summary.summary.model.user.Photo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PhotoService {

    List<Photo> findByPhoto(Long idUser);
}
