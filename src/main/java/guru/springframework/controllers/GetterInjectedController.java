package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import guru.springframework.services.GreetingService;

/**
 * Created by jt on 5/24/17.
 */
@Service
public class GetterInjectedController {
	
	private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
    
    @Autowired
    @Qualifier("getterGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
