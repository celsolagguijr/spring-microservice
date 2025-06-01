package com.oztech.services.app.oztech_miscroservice_client1_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OztechMiscroserviceClient1AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OztechMiscroserviceClient1AppApplication.class, args);
	}

}
