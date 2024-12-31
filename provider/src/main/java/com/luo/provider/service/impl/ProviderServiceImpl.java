package com.luo.provider.service.impl;

import com.luo.provider.service.IProviderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;


@DubboService
public class ProviderServiceImpl implements IProviderService {
    @Override
    public String dogSay() {
        return "汪汪汪！";
    }

    @Override
    public String catSay() {
        return "喵喵喵！";
    }

    @Override
    public String justSay(String msg) {
        return msg;
    }
}
