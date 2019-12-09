package com.ecomerce.microcomerce.modele;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
 
 

@Entity
public class Product implements Serializable{
 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	protected int identifiant ;
	
	protected String desigantion ;
	
	protected double prix; 
	
	protected int quantite ;
	
	@ManyToOne
	@JoinColumn(name ="id_categorie")
	@JsonBackReference
	private Categorie categories;
	
	
	public Product() {
		super();
	}


	public Product(String desigantion, double prix, int quantite, Categorie categories) {
		super();
		this.desigantion = desigantion;
		this.prix = prix;
		this.quantite = quantite;
		this.categories = categories;
	}


	public int getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}


	public String getDesigantion() {
		return desigantion;
	}


	public void setDesigantion(String desigantion) {
		this.desigantion = desigantion;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public Categorie getCategories() {
		return categories;
	}


	public void setCategories(Categorie categories) {
		this.categories = categories;
	}


	@Override
	public String toString() {
		return "Product [identifiant=" + identifiant + ", desigantion=" + desigantion + ", prix=" + prix + ", quantite="
				+ quantite + ", categories=" + categories + "]";
	}
	
	
 

}
