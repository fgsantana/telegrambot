package com.test.telegrambot.client;

import com.test.telegrambot.dto.MessageS;
import com.test.telegrambot.dto.ResultMessageS;
import com.test.telegrambot.dto.ResultUpdate;
import com.test.telegrambot.dto.Update;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@FeignClient(url = "${telegram.api}${telegram.token}", name= "telegram")
public interface Client {



    @GetMapping("/getUpdates")
    ResultUpdate getUpdates();

    @GetMapping("/sendMessage")
    ResultMessageS sendMessage(@RequestBody MessageS message);

}
