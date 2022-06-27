package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.ConstructorInjectedService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController( new ConstructorInjectedService());
    }



    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}