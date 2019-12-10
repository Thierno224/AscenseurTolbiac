package com.ecomerce.microcommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.microcommerce.Dao.LivreRepository;
import com.ecomerce.microcommerce.modele.Livre;

@RestController
public class LivreController {
	
	@Autowired
	private LivreRepository livreRepository ;
	
	@GetMapping(value="/livres")
	public List<Livre> listeDesLivre(){
		return livreRepository.findAll() ;
	}
	
	@GetMapping(value="/livres/{id}")
	public Livre chercherParId(@PathVariable long id) {
		return livreRepository.findById(id);
		
	}
	
	@PostMapping(value="/livres")
	public void enregistrerUnLivre(@RequestBody Livre livre) {
		livreRepository.save(livre) ;
	}
	
	@DeleteMapping(value="livres/{id}")
	public void supprimerUnLivre(@PathVariable long id) {
		livreRepository.deleteById(id);
	}

}
