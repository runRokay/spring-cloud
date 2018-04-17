package com.example.cloudconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "cloud-apiservice")
public interface ApiRemote {
    @RequestMapping("/api/getApi")
    public String getApi();
}
