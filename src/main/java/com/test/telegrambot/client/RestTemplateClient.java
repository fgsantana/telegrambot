package com.test.telegrambot.client;

import com.test.telegrambot.dto.ResultUpdate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateClient {
    @Value("${telegram.api}")
    private String url;
    @Value("${telegram.token}")
    private String token;


    private RestTemplate restTemplate;

    public RestTemplateClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
     public ResultUpdate getUpdate(){
        ResultUpdate res = restTemplate.getForObject(url + token + "/getUpdates", ResultUpdate.class);
        return res;
     }



}
