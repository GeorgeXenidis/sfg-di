package me.springframework.sfgdi.controllers;

import me.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propInjCntr;

    @BeforeEach
    void setUp()
    {
        propInjCntr = new PropertyInjectedController();

        propInjCntr.greetingService = new ConstructorGreetingService();
    }

    @Test
    void printGreeting() {
        System.out.println(propInjCntr.printGreeting());
    }
}