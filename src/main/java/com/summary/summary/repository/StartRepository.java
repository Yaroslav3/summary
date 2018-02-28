package com.summary.summary.repository;

import com.summary.summary.model.Site;
import com.summary.summary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Repository
public interface StartRepository extends JpaRepository<User, Long> {


}
