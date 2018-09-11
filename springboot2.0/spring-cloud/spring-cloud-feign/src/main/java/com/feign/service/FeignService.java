package com.feign.service;

import com.feign.service.impl.FeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "eureka-client-one",fallback = FeignHystrix.class)
public interface FeignService {

    @RequestMapping(value = "/get-client-name")
    public String get();

}
