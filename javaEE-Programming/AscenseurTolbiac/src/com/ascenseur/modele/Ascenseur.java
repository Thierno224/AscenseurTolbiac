package com.ascenseur.modele;

import java.util.List;

public abstract class Ascenseur {
    
	protected String nomAscenseur ;
	protected int etageCourant ; // Etage où se trouve l'ascenseur 
	protected int poids;         // Poids de l'ascenseur une fois que des personnes monte
	protected int poidsMax ;     // Poids maximum qu'elle peut supporter
	
	protected List<Personne> personnes ;

	//********************* Constructeur sans parametre *********** 
	
	public Ascenseur() {
		super();
	}

	//********************* Constructeur avec parametres ***********
	public Ascenseur(String nomAscenseur, int etageCourant, int poids, int poidsMax, List<Personne> personnes) {
		super();
		this.nomAscenseur = nomAscenseur;
		this.etageCourant = etageCourant;
		this.poids = poids;
		this.poidsMax = poidsMax;
		this.personnes = personnes;
	}

	//************ GETTERS AND SETTERS ****************************
	public String getNomAscenseur() {
		return nomAscenseur;
	}

	public void setNomAscenseur(String nomAscenseur) {
		this.nomAscenseur = nomAscenseur;
	}

	public int getEtageCourant() {
		return etageCourant;
	}

	public void setEtageCourant(int etageCourant) {
		this.etageCourant = etageCourant;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public int getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(int poidsMax) {
		this.poidsMax = poidsMax;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	//********************** Afficher un ascenseur ***************
	
	public String toString() {
		return "Ascenseur [nomAscenseur=" + nomAscenseur + ", etageCourant=" + etageCourant + ", poids=" + poids
				+ ", poidsMax=" + poidsMax + ", personnes=" + personnes + "]";
	}
	
	
	//**************** Travail à fair **************************
	
	

    
    

}
