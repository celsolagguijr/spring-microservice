package com.oztech.services.app.oztech_miscroservice_client1_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;


@RestController
public class CreateSentenceController {

 @Autowired
 private DiscoveryClient discoveryClient;


 @GetMapping("/clients")
 public DiscoveryClient getDiscoveryClient(){
  return this.discoveryClient;
 }

 @GetMapping("/generate-sentence")
 public String generateSentence(){

  String[] services = {
          "oztech-miscroservice-client-subject-app",
          "oztech-miscroservice-client-verb-app",
          "oztech-miscroservice-client-article-app",
          "oztech-miscroservice-client-adjective-app",
          "oztech-miscroservice-client-noun-app"
  };

  var result = new StringBuilder();

  for (String service : services){
   ServiceInstance instance= this.discoveryClient.getInstances(service).get(0);
   URI uri = instance.getUri();
   result.append(new RestTemplate().getForObject(uri,String.class));
   result.append(" ");
  }

  return result.toString();

 }

}
