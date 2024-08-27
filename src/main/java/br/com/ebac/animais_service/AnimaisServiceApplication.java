package br.com.ebac.animais_service;

import br.com.ebac.animais_service.controllers.AnimalController;
import br.com.ebac.animais_service.repository.AnimalRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimaisServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimaisServiceApplication.class, args);
	}
}
