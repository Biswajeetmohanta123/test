package com.example.UrlHit.services;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    private int count = 0;

    public int incrementCount() {
        return count++;
    }
}
