package com.ecomerce.microcommerce.modele;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CollectionLivre {
	
	@Id
	@GeneratedValue
	private long ISBN ;
	private String nomCollection ;
	private List<Livre> livres ;
	
	
	public CollectionLivre() {
		super();
	}


	public CollectionLivre(String nomCollection, List<Livre> livres) {
		super();
		this.nomCollection = nomCollection;
		this.livres = livres;
	}


	public long getISBN() {
		return ISBN;
	}


	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}


	public String getNomCollection() {
		return nomCollection;
	}


	public void setNomCollection(String nomCollection) {
		this.nomCollection = nomCollection;
	}


	public List<Livre> getLivres() {
		return livres;
	}


	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}


	@Override
	public String toString() {
		return "CollectionLivre [ISBN=" + ISBN + ", nomCollection=" + nomCollection + 
				", livres=" + livres + "]";
	}


    
	
	

}
