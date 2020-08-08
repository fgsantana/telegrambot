package com.test.telegrambot.rest;

import com.test.telegrambot.client.Client;
import com.test.telegrambot.client.RestTemplateClient;
import com.test.telegrambot.dto.*;
import com.test.telegrambot.service.TelegramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TelegramResource {


    @Autowired
    TelegramService service;


    @GetMapping("/updates")
    public ResultUpdate getUpdates() {
        return service.getUpdates();
    }


    @GetMapping("/message")
    public ResultMessageS sendMessage() {
        return service.sendReplyMessage();


    }
}
