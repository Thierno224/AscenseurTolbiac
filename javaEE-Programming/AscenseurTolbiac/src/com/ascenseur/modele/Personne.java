package com.ascenseur.modele;

public class Personne {
	
	protected String nom ;
	protected int poids ;
	
	public Personne() {
		super();
	}

	public Personne(String nom, int poids) {
		super();
		this.nom = nom;
		this.poids = poids;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", poids=" + poids + "]";
	}
	
	
    
}
