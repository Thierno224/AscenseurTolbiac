package com.ecomerce.microcomerce.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.microcomerce.modele.Categorie;

@Repository
public interface CategorieDao extends JpaRepository<Categorie, Integer> {
	
	public Categorie findById(int identifiant);

}
