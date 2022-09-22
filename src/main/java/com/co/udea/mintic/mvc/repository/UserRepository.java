package com.co.udea.mintic.mvc.repository;

import com.co.udea.mintic.mvc.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
