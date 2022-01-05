package com.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ChatController {

    @GetMapping("/")
    public String chat(){
        return "chat";
    }
}
