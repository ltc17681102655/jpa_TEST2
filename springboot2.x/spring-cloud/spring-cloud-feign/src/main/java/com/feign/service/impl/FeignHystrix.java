package com.feign.service.impl;

import com.feign.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignHystrix implements FeignService {

    @Override
    public String get() {
        return "service stop == error";
    }
}
