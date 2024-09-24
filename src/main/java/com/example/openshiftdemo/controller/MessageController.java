package com.example.openshiftdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello from OpenShift!";
    }

    @PostMapping("/message")
    public String getAnotherMessage(@RequestBody String message) {
        return message;
    }
}
