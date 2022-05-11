package com.twitter.clone.api.controller;

import com.twitter.clone.api.service.TweetsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tweets")
@CrossOrigin(origins = "http://localhost:4200")
public class TweetsController {
    
    @Autowired
    private TweetsService tweetsService;
}
