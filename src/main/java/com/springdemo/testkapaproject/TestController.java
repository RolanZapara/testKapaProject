package com.springdemo.testkapaproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping
    public String BaseURL() {
        return "This is basic test application";
    }

    @RequestMapping("/snow")
    public String firstEndpoint() {
        return "new endpoint";
    }
}
