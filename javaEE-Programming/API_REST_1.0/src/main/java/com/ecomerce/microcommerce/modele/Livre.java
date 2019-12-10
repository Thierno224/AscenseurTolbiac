package com.ecomerce.microcommerce.modele;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livre implements Serializable{
 
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    private long ISBN ;
	
    private String titre ;
    private String auteur ; 
    private String genere ;
	
    
    public Livre() {
		super();
	}


	public Livre(String titre, String auteur, String genere) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.genere = genere;
	}


	public long getISBN() {
		return ISBN;
	}


	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere (String genere) {
		this.genere = genere;
	}


	@Override
	public String toString() {
		return "Livre [ISBN=" + ISBN + ", titre=" + titre + ", auteur=" + auteur + 
				    ", genere=" + genere + "]";
	}
    
    
    
    

}
