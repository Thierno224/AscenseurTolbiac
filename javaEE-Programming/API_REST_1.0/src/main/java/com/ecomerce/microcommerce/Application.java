package com.ecomerce.microcommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecomerce.microcommerce.Dao.LivreRepository;
import com.ecomerce.microcommerce.modele.Livre;


@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	LivreRepository livreRepository ;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		for(int i = 0 ; i < 100; i++) {
		livreRepository.save(new Livre("Developper Une API en Jave",
				"Jams Goslin", "Education"));
		
		livreRepository.save(new Livre("Apprendre a programmer Phyton",
				"François Dupont", "Education"));
		
		livreRepository.save(new Livre("Spring frameworks",
				"Diallo Thierno", "Education"));
		
		livreRepository.save(new Livre("Lunix commande",
				"Linus Torvars", "Education"));
		
		livreRepository.save(new Livre("Le roi du Kahel",
				"Thierno mo Nenembo", "Histoire"));
		}
		
	}

 
}
