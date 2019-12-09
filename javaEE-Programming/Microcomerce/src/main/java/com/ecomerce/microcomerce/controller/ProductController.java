package com.ecomerce.microcomerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.microcomerce.Dao.ProductDao;
import com.ecomerce.microcomerce.exception.ProduitIntrouvableException;
import com.ecomerce.microcomerce.modele.Product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

   
@Api(description="Gestion des produits")
@RestController
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
	@ApiOperation("Afficher la liste des produits ")
	@RequestMapping(value="/Produits" , method = RequestMethod.GET)
	public List<Product> listeProduit(){
		return productDao.findAll() ; 
	}
   
	@ApiOperation("Récuperer un produit selon son ID")
	   @GetMapping(value="/Produits/{id}")
	    public Product afficherUnProduit(@PathVariable int id) throws ProduitIntrouvableException {
	        Product produit = productDao.findById(id);
	        
	        if(produit == null) throw new ProduitIntrouvableException(
	        		"le produit avec l'id " +id+ " n'existe pas !");
	        
	        return produit ;
	    } 
	    
	    @ApiOperation("Enrestrer un produit dans la base de données")
	    @PostMapping(value="/Produits")
	    public void enregistrerProduct(@RequestBody Product produit) {
	    	productDao.save(produit);
	    }
	    
	    @ApiOperation("Afficher la liste des produit chèr selon le critère ")
	    @GetMapping(value="Prix/Produits/{prixLimit}")
	    public List<Product> PrixSuperieur(@PathVariable double prixLimit){
	    	return productDao.findByPrixGreaterThan(prixLimit);
	    	 
	    } 
	    
	    @ApiOperation("Chercher un produit par mot clé")
	    @GetMapping(value="/Produits/motCle/{recherche}")
	    public List<Product> rechercherParMotCle(@PathVariable String recherche) {
	    	return productDao.findBydesigantionLike("%"+recherche+"%");
	    }
	    
	    @ApiOperation("Mise à jours d'un produit ")
	    @PutMapping(value="/Produits")
	    public void miseAjour(@RequestBody Product produit) {
	    	productDao.save(produit) ;
	    }
	    
	    @ApiOperation("Supprimer un produit ")
	    @DeleteMapping(value="/Produits/{id}")
	    public void supprimerUnProduit(@PathVariable int id) {
	    	productDao.deleteById(id);
	    }
	   
	    
}
