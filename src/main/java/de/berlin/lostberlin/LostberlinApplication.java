package de.berlin.lostberlin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LostberlinApplication {

	public static void main(String[] args) {
		SpringApplication.run(LostberlinApplication.class, args);
	}
}
