package com.ecomerce.microcomerce.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 
import org.springframework.stereotype.Repository;

import com.ecomerce.microcomerce.modele.Product;


@Repository 
public interface ProductDao extends JpaRepository<Product, Integer>{
	
	
	  public Product findById(int id);
	  
	  public List<Product> findByPrixGreaterThan(double prixLimit) ;
	  
	  public List<Product> findBydesigantionLike(String recherche) ;
	  
	  
	
 
	
	
	
	
	/*
	public List<Product> findAll() ;
	public Product findById(int id) ;
	public void productSave(Product produit);
	public double calculCoutTotal() ;
	public void delete(int id);
	public Product rechercheMC(String mc);
	public double maxPrix() ;
	public int quantiteTotal();
*/
}
