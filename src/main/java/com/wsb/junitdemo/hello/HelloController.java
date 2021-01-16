package com.wsb.junitdemo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Hello hello(@RequestParam(value = "name", defaultValue = "WSB") String name) {
        return new Hello(name);
    }
}
