package com.summary.summary.repository;

import com.summary.summary.model.user.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SiteRepository extends JpaRepository<Site ,Long> {

    @Query(value = "SELECT * FROM site where user_id= ?1", nativeQuery = true)
    List<Site> findBySites(Long idUser);
}
