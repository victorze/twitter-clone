package com.twitter.clone.api.repository;

import com.twitter.clone.api.models.Tweet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetsRepository extends JpaRepository<Tweet, Integer> {

}
