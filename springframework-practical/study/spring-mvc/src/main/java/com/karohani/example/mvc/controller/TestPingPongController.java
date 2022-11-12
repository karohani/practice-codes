package com.karohani.example.mvc.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestPingPongController {

    @GetMapping
    public String pong(){
        return "";
    }
}
