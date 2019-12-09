package com.ecomerce.microcomerce.modele;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
  
@Entity
public class Categorie implements Serializable{
 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	int idCategorie ;
	
	String codeCategorie; 
	
	String designatgion ;
	
	@OneToMany (targetEntity =Product.class, mappedBy="categories", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	List<Product> produits ;

	
	
	
	public Categorie() {
		super();
	}

	public Categorie(String codeCategorie, String designatgion, List<Product> produits) {
		super();
		this.codeCategorie = codeCategorie;
		this.designatgion = designatgion;
		this.produits = produits;
	}

	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCodeCategorie() {
		return codeCategorie;
	}

	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}

	public String getDesignatgion() {
		return designatgion;
	}

	public void setDesignatgion(String designatgion) {
		this.designatgion = designatgion;
	}

	public List<Product> getProduits() {
		return produits;
	}

	public void setProduits(List<Product> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", codeCategorie=" + codeCategorie + ", designatgion="
				+ designatgion + ", produits=" + produits + "]";
	}

 
	

}
