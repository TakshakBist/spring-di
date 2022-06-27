package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.ConstructorInjectedService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    SetterInjectedController setterBasedController;

    @BeforeEach
    void setUp() {
        setterBasedController = new SetterInjectedController();
        setterBasedController.setGreetingService(new ConstructorInjectedService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterBasedController.getGreeting());
    }
}