package com.codeclan.example.filetrackersystem.repositories;

import com.codeclan.example.filetrackersystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
