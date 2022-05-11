package com.twitter.clone.api.repository;

import com.twitter.clone.api.entity.Tweets;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetsRepository extends JpaRepository<Tweets, Integer> {
    
}
