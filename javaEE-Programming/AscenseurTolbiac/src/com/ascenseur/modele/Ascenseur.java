package com.ascenseur.modele;

import java.util.List;
import java.util.Scanner;

public abstract class Ascenseur {
    
	protected String nomAscenseur ;
	protected int etageCourant = 0 ; // Etage où se trouve l'ascenseur 
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
	
	
	//**************** APPEL ASCENSEUR **************************
	
	
	public int appleAscenseur () {
		int maPosition = 0;
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("\n Quelle est votre position actuelle ????");
		
		maPosition = saisie.nextInt() ;
		
		return maPosition ;
	}
	
	//**************** LA METHODE POUR MONTER **************************
	
	public void monter()   {
 
		
		this.etageCourant = appleAscenseur () ;
		
		Scanner saisie = new Scanner(System.in);
		System.out.println("\n Veuillez saisir le numero de votre : ");
		int numEtage = saisie.nextInt() ;
		
		int destination = numEtage ;

		int sommePoids = 0; 
		
		for (Personne  i : personnes) 
			sommePoids = sommePoids + i.getPoids();
		    
			if(sommePoids > this.poidsMax) {
				System.out.println("Désolé vous êtes nombreux par rapport au poids de l'ascenseur ");
				System.out.println("\n Tolal poids autorisée : "+this.poidsMax+" kg"+" , "
					                	+ "et vous faites au total un poids de : "+sommePoids+" kg");
			} else {
				for(int compteur = etageCourant ; compteur <= destination ; compteur++) {
				   
					System.out.println(" Vous êtes monté au niveau :  "+etageCourant); 	
				    etageCourant = etageCourant + 1;
				    try {
						Thread.sleep(3000);  
					} catch (InterruptedException e) {
						 
						e.printStackTrace();
					}
				}  			    
				    System.out.println("\n Felicitation !!! Vous êtes arrivée a votre destination : Etage  ["+destination+"]");
				   
			}
					  
	}
  

}
