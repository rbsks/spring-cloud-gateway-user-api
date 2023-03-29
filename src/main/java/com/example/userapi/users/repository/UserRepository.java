package com.example.userapi.users.repository;

import com.example.userapi.users.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
