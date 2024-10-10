package com.cye.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cye.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
   
}

