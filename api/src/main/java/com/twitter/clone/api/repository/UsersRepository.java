package com.twitter.clone.api.repository;

import com.twitter.clone.api.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {

}
