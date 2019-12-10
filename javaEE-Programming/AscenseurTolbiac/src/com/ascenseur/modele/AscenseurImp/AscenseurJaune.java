package com.ascenseur.modele.AscenseurImp;

import java.util.List;

import com.ascenseur.modele.Ascenseur;
import com.ascenseur.modele.Personne;

public class AscenseurJaune extends Ascenseur{
	
	protected String reference ;

	public AscenseurJaune() {
		super();
		 
	}

	public AscenseurJaune(String nomAscenseur, int etageCourant, int poids, 
			               int poidsMax, List<Personne> personnes, String reference) {
		super(nomAscenseur, etageCourant, poids, poidsMax, personnes);
		 
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
