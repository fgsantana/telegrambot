package com.test.telegrambot.rest;

import com.test.telegrambot.client.Client;
import com.test.telegrambot.dto.ResultUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TelegramResource {
    @Autowired
    Client client;

    @GetMapping
    public ResponseEntity<ResultUpdate> a(){
        return client.getUpdates();
    }
}
