package com.example.cloudconsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ApiRemote apiRemote;

    @RequestMapping("/getApi")
    @HystrixCommand(fallbackMethod = "fallback_test")
    public String getApi(){
        ObjectMapper om = new ObjectMapper();
        return apiRemote.getApi();
    }

    public String fallback_test(){
        return "fail";
    }
}
