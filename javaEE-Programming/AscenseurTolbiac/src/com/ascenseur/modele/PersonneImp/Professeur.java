package com.ascenseur.modele.PersonneImp;

import com.ascenseur.modele.Personne;

public class Professeur extends Personne{
	
	protected int codeProf ;

	public Professeur() {
		super();
		 
	}

	public Professeur(int codeProf, String nom, int poids) {
		super(nom, poids);
		 
		this.codeProf = codeProf ;
	}

	public int getCodeProf() {
		return codeProf;
	}

	public void setCodeProf(int codeProf) {
		this.codeProf = codeProf;
	}
	
	public void afficher() {
		System.out.println("Code prof : "+super.toString());
	}

}
