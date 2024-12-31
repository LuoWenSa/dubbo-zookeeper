package com.luo.consumer.controller;

import com.luo.provider.service.IProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo")
public class ConsumerController {

    @DubboReference
    private IProviderService providerService;

    @GetMapping("/dogSay")
    public String dogSay(){
        return providerService.dogSay();
    }

    @GetMapping("/otherSay/{msg}")
    public String otherSay(@PathVariable String msg){
        return providerService.justSay(msg);
    }
}
