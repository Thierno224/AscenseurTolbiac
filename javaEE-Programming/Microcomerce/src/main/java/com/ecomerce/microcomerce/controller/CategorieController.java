package com.ecomerce.microcomerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.microcomerce.Dao.CategorieDao;
import com.ecomerce.microcomerce.exception.CategorieIntrouvableException;
import com.ecomerce.microcomerce.modele.Categorie;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="Gestion de categorie")
@RestController
public class CategorieController {
	
	@Autowired
	private CategorieDao categorieDao ;
	
	@ApiOperation("Afficher la liste de categorie des produits")
	@GetMapping(value="/Categories")
	public List<Categorie> listeCategorie(){
		return categorieDao.findAll() ;
	}
	
	@ApiOperation("Chercher une catetegorie selon un ID")
	@GetMapping(value="/Categories/{identifiant}")
	public Categorie rechercheParId(@PathVariable int identifiant) {
		
		Categorie categorie =categorieDao.findById(identifiant) ;
		
		if(categorie == null) throw new CategorieIntrouvableException("Sorry !!!"
				+ "La categorie avec l'ID "+identifiant+" n'esxiste pas. ");
		
		return categorie ;
	}
	
	
	

}
