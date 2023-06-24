package com.example.UrlHit.controller;

import com.example.UrlHit.services.UrlHitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    private final UrlHitService urlHitService;

    public UrlHitController(UrlHitService urlHitService) {

        this.urlHitService = urlHitService;
    }

    @GetMapping("/count")
    public Map<String, Integer> getHitCount() {
        int count = urlHitService.incrementCount();
        Map<String, Integer> response = new HashMap<>();
        response.put("visitors", count);
        return response;
    }
}
