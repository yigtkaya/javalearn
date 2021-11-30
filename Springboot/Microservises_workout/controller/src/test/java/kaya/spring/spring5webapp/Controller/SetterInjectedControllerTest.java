package kaya.spring.spring5webapp.Controller;

import kaya.spring.spring5webapp.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetingService());
    }
}