package com.ascenseur.modele.AscenseurImp;

import java.util.List;

import com.ascenseur.modele.Ascenseur;
import com.ascenseur.modele.Personne;

public class AscenseurRouge extends Ascenseur{
	
	protected String reference ;

	public AscenseurRouge() {
		super();
		 
	}

	public AscenseurRouge(String reference, String nomAscenseur, int etageCourant, 
			                int poids, int poidsMax, List<Personne> personnes) {
		super(nomAscenseur, etageCourant, poids, poidsMax, personnes);
		
		this.reference = reference ;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public void Afficher() {
		System.out.println(super.toString() +" N° ref : "+this.reference) ;
	}

}
