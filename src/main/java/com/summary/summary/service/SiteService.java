package com.summary.summary.service;

import com.summary.summary.model.user.Site;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SiteService {

    List<Site> findBySites(Long idUser);
}
