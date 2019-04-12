package com.example.eureka_client_source.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


//@FeignClient(name="eurekaClient1",url = "http://localhost:8762")
@FeignClient(name="eurekaClient1")
public interface ProductClient {
    @RequestMapping(value="/demo/getLunarDateByParam", method= RequestMethod.GET)
    String zuulLunar(@RequestParam(value="year") String year,
                     @RequestParam(value="month") String month,
                     @RequestParam(value="day") String day);
}
