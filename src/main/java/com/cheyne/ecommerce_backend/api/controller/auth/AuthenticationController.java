package com.cheyne.ecommerce_backend.api.controller.auth;

import com.cheyne.ecommerce_backend.api.model.*;
import com.cheyne.ecommerce_backend.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    private UserService userService;

    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public void registerUser(@RequestBody RegistrationBody registrationBody) {


    }

}
