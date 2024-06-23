package com.hutech.hna.Lab02.repository;

import com.hutech.hna.Lab02.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
