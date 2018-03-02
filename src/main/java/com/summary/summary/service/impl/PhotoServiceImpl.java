package com.summary.summary.service.impl;

import com.summary.summary.model.user.Photo;
import com.summary.summary.repository.PhotoRepository;
import com.summary.summary.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoRepository repository;

    public List<Photo> findByPhoto(Long idUser) {
        return repository.findByPhoto(idUser);
    }
}
