package me.springframework.sfgdi.controllers;

import me.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setInjCntr;

    @BeforeEach
    void setUp()
    {
        setInjCntr = new SetterInjectedController();

        setInjCntr.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void printGreeting() {
        System.out.println(setInjCntr.printGreeting());
    }
}