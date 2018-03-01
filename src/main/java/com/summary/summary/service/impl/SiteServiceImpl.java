package com.summary.summary.service.impl;


import com.summary.summary.model.user.Site;
import com.summary.summary.repository.SiteRepository;
import com.summary.summary.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SiteServiceImpl implements SiteService {

    @Autowired
    private SiteRepository repository;


    public List<Site> findBySites(Long idUser) {
        return repository.findBySites(idUser);
    }
}
