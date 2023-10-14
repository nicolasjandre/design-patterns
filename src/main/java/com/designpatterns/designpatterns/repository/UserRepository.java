package com.designpatterns.designpatterns.repository;

import com.designpatterns.designpatterns.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
