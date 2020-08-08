package com.test.telegrambot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.telegrambot.client.Client;
import com.test.telegrambot.client.RestTemplateClient;
import com.test.telegrambot.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelegramService {


    @Autowired
    private Client client;

    public ResultUpdate getUpdates() {
        return client.getUpdates();
    }

    public ResultMessageS sendReplyMessage() {
        MessageS message = new MessageS();
        List<Update> list = client.getUpdates().getResult();
        Message lastMessage = list.get(list.size() - 1).getMessage();
        message.setChat_id(String.valueOf(lastMessage.getFrom().getId()));
        message.setText(lastMessage.getText());
        return client.sendMessage(message);
    }
}
