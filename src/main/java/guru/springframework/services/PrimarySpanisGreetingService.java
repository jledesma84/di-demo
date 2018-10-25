package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanisGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Servicio de saludo primario";
	}
	
}
