package com.grapefruit.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class YourController {

    @GetMapping("/hello")
    public String getHello(@RequestHeader(value = "cookie") String cookie) {

        return "Hello, Swagger!" + cookie;
    }
}
