package com.ecomerce.microcommerce.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ecomerce.microcommerce.modele.Livre;
 
@Repository
public interface LivreRepository extends JpaRepository<Livre, Long>{
	
	public Livre findById(long id);

}
 