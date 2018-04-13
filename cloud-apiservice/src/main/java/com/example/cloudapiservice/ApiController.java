package com.example.cloudapiservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/getApi")
    public String getApi(){

        return "aaaaa";
    }
}
