package kaya.spring.spring5webapp.Controller;

import kaya.spring.spring5webapp.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
