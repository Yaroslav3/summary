package com.summary.summary.repository;

import com.summary.summary.model.profile.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StartRepository extends JpaRepository<User, Long> {


//    @Query(value = "SELECT * FROM user",nativeQuery = true)
    User findById(Long aLong);
}
