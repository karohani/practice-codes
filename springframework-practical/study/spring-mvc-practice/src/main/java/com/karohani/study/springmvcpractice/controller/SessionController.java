package com.karohani.study.springmvcpractice.controller;

import lombok.Getter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

@RestController
@RequestMapping("/api/practice/session")
public class SessionController {

    @GetMapping("")
    public String get(@SessionAttribute(name = "KEY") String sessionKey) {
        return sessionKey;
    }

    @GetMapping("/object")
    public TestDto get(@SessionAttribute(name = "OBJECT_KEY") TestDto dto) {
        System.out.println(dto);
        return dto;

    }

    @ToString
    @Getter
    public static class TestDto {
        private String aa;
        private String bb;
        public TestDto(String aa, String bb) {
            this.aa = aa;
            this.bb = bb;
        }
    }
}
