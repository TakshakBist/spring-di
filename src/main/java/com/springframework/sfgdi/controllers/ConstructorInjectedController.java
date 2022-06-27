package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    @Qualifier("constructorInjectedService")
    @Autowired
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorInjectedService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
