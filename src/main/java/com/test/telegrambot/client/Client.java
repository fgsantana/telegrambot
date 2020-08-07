package com.test.telegrambot.client;

import com.test.telegrambot.dto.ResultUpdate;
import com.test.telegrambot.dto.Update;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@FeignClient(url = "https://api.telegram.org/bot1206975479:AAHriKQuVXB-0nX5hFtLhcKmX-cXpavxnOQ", name= "telegram")
public interface Client {

    @GetMapping("/getUpdates")
    ResponseEntity<ResultUpdate> getUpdates();

}
