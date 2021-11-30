package kaya.spring.spring5webapp.Controller;

import kaya.spring.spring5webapp.services.GreetingService;

public class ConsturctorInjectedController {
    private final GreetingService greetingService;

    public ConsturctorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String setGreeting(){
        return greetingService.sayGreeting();
    }
}
