package com.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
