package com.golearntolead.registration.registrationController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/registration/")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("register")
    public String register(@RequestBody RegistrationRequest registrationRequest ){
        return registrationService.register(registrationRequest);
    }

    @GetMapping("confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }
}
