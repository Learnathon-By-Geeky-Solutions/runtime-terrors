package org.learnathon.tradingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String home() {
        return "Welcome to Trading App";
    }
    @GetMapping("/api")
    public String Secure() {
        return "Welcome to Trading App Secure";
    }
}
