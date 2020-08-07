package com.test.telegrambot.client;

import com.test.telegrambot.dto.ResultUpdate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@FeignClient(url = "${telegram.api}${telegram.token}", name= "telegram")
public interface Client {

    @GetMapping("/getUpdates")
    ResponseEntity<ResultUpdate> getUpdates();

}
