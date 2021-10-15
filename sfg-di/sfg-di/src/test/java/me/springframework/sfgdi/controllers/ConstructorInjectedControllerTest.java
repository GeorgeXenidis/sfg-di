package me.springframework.sfgdi.controllers;

import me.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController consInjCntr;

    @BeforeEach
    void setUp() {
        consInjCntr = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void printGreeting() {
        System.out.println(consInjCntr.printGreeting());
    }
}