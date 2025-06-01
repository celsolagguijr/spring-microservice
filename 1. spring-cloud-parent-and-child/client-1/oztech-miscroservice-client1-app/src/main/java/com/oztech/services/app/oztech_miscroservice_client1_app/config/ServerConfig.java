package com.oztech.services.app.oztech_miscroservice_client1_app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Configuration
public class ServerConfig {

    @Value("${oztek}")
    private String serverName;

    @Value("${lucky-word}")
    private String luckyName;

    public String getServerName() {
        return this.serverName;
    }

    public String getLuckyName(){
        return this.luckyName;
    }
}
