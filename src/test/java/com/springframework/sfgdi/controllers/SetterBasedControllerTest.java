package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    SetterInjectedController setterBasedController;

    @BeforeEach
    void setUp() {
        setterBasedController = new SetterInjectedController();
        setterBasedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterBasedController.getGreeting());
    }
}