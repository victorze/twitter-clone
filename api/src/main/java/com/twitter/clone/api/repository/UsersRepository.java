package com.twitter.clone.api.repository;

import com.twitter.clone.api.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    
}
