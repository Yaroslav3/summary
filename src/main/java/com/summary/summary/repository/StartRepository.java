package com.summary.summary.repository;

import com.summary.summary.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StartRepository extends JpaRepository<User, Long> {


}
