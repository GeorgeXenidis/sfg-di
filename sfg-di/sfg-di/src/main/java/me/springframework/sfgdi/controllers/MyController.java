package me.springframework.sfgdi.controllers;

import me.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController
{

    private final GreetingService greetingService;

    //@Autowired is optional here. Spring autoconfigures it.
    //Because @Qualifier is missing, the PRIMARY BEAN will be used (@Primary).
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
