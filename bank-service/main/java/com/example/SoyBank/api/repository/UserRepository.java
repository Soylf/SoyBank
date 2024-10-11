package com.example.SoyBank.api.repository;

import com.example.SoyBank.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
