package me.springframework.sfgdi.controllers;

import me.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController
{
    @Autowired
    @Qualifier("propertyGreetingService")
    //I create an instance of the interface to use its methods. I didn't want my hole class to implement the interface.
    public GreetingService greetingService;

    public String printGreeting()
    {
        return greetingService.sayGreeting();
    }
}
