package kaya.spring.spring5webapp.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("hello world");
        return "Hello folks";
    }
}
