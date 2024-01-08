package com.grapefruit.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api(tags = "Your API Controller")
public class YourController {

    @GetMapping("/hello")
    @ApiOperation("Get a hello message")
    public String getHello(@RequestHeader(value = "cookie") String cookie) {

        return "Hello, Swagger!" + cookie;
    }
}
