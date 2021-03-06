package com.javacodegeeks.example.web;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WebSubstractionService {
    @Autowired
    @LoadBalanced
    protected RestTemplate restTemplate;
    protected String serviceUrl;
    protected Logger logger = Logger.getLogger(WebSubstractionService.class
            .getName());
    public WebSubstractionService(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
                : "http://" + serviceUrl;
    }
    public String substract(String minuend, String subtrahend) {
        return restTemplate.getForObject(serviceUrl + "/substract?minuend={minuend}&subtrahend={subtrahend}", String.class, minuend, subtrahend);
    }
}
