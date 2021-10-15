package me.springframework.sfgdi.controllers;

import me.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController
{
    private final GreetingService greetingService;

    //Because the existence of the constructor here, the instance of the class GreetingService is created automatically, no need to autowire the constructor.
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String printGreeting()
    {
        return greetingService.sayGreeting();
    }

}
