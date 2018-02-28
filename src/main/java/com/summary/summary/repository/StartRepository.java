package com.summary.summary.repository;

import com.summary.summary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface StartRepository extends JpaRepository<User, Long> {


    @Query(value = "SELECT * FROM user", nativeQuery = true)
    User findById(Long aLong);

    @Query(value = "INSERT INTO summary.user (data_of_birth) VALUE (?1)",nativeQuery = true)
    LocalDateTime createData(LocalDateTime localDateTime);
}
