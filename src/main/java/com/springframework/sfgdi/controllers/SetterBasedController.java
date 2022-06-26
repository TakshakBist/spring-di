package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingService;

public class SetterBasedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
