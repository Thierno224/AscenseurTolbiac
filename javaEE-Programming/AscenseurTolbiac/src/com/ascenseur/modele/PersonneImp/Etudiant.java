package com.ascenseur.modele.PersonneImp;

import com.ascenseur.modele.Personne;

public class Etudiant extends Personne{
	
    protected int codEtudiant ;

	public Etudiant() {
		super(); 
	}

	public Etudiant(int codEtudiant, String nom, int poids) {
		super(nom, poids);
		
		this.codEtudiant = codEtudiant ; 
		 
	}

	public int getCodEtudiant() {
		return codEtudiant;
	}

	public void setCodEtudiant(int codEtudiant) {
		this.codEtudiant = codEtudiant;
	}
    
    public void afficher() {
    	System.out.println("Code etud : "+this.codEtudiant+"  "+super.toString()) ;
    }

}
