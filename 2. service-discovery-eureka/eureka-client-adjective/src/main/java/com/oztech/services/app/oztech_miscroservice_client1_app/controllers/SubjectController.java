package com.oztech.services.app.oztech_miscroservice_client1_app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {

    @Value("${words}")
    public String words;

    @GetMapping("/")
    public String getWord() {
        String[] wordArray = this.words.split(",");
        int i = (int)Math.round(Math.random() * (wordArray.length - 1));
        return wordArray[i];
    }

}
