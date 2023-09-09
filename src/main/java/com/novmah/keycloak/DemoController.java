package com.novmah.keycloak;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/hello")
    @PreAuthorize("hasRole('client_user')")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return "Hello from Spring boot & Keycloak";
    }

    @GetMapping("/hi")
    @PreAuthorize("hasRole('client_admin')")
    @ResponseStatus(HttpStatus.OK)
    public String hi() {
        return "hi from Spring boot & Keycloak - ADMIN";
    }

}
