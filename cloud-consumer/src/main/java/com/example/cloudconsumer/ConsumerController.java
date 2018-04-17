package com.example.cloudconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ApiRemote apiRemote;

    @RequestMapping("/getApi")
    public String getApi(){

        return apiRemote.getApi();
    }
}
