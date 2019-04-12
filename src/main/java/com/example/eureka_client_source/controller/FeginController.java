package com.example.eureka_client_source.controller;

import com.example.eureka_client_source.client.ProductClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feigndemo")
public class FeginController {

    @Autowired
    private ProductClient productClient;

    @RequestMapping(value="/getLunar",method=RequestMethod.GET)
    public String getLunar(@RequestParam(value="year",defaultValue="2019") String year,
                           @RequestParam(value="month",defaultValue="1") String month,
                           @RequestParam(value="day",defaultValue="1") String day){
        String lunar = productClient.zuulLunar(year,month,day);
        System.out.println(lunar);
        return lunar;
    }
}
