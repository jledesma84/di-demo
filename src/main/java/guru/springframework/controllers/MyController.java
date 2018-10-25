package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class MyController {

	GreetingService greetingService;
	
    public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello(){
        System.out.println("Hello!!! ");

        return greetingService.sayGreeting();
    }
}
