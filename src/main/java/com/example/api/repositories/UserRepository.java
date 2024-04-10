package com.example.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.domain.user.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}
