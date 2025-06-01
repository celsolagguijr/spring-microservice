package com.oztech.services.app.oztech_miscroservice_client1_app.controllers;

import com.oztech.services.app.oztech_miscroservice_client1_app.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/client1")
public class AppController {

    @Autowired
    private ServerConfig serverConfig;

    @GetMapping("/get-server-settings")
    public Map<String, String> getServerSettings(){
        Map<String,String> settings = new HashMap<>();
        settings.put("oztek",serverConfig.getServerName());
        settings.put("lucy_word",serverConfig.getLuckyName());
        return settings;
    }

}
