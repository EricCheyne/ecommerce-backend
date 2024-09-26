package com.cheyne.ecommerce_backend;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
