package com.ascenseur.modele.PersonneImp;

import com.ascenseur.modele.Personne;

public class Administratif extends Personne{
	
	protected String reference ;

	public Administratif() {
		super();
		 
	}

	public Administratif(String reference, String nom, int poids) {
		super(nom, poids);
		
		this.reference = reference ;
		 
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public void afficher() {
		System.out.println("N° de ref : "+super.toString());
	}


}
