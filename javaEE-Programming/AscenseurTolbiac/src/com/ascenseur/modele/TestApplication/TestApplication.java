package com.ascenseur.modele.TestApplication;

 
import java.util.ArrayList;
import java.util.List;

import com.ascenseur.modele.Personne;
import com.ascenseur.modele.AscenseurImp.AscenseurRouge;
import com.ascenseur.modele.PersonneImp.Administratif;
import com.ascenseur.modele.PersonneImp.Etudiant;
import com.ascenseur.modele.PersonneImp.Professeur;

public class TestApplication {

	public static void main(String[] args)   {
		
		List<Personne> arrayPersonne = new ArrayList<>();
		
		//********************* INSTANCIATION DES ETUDIANTS *********************
		 
		Etudiant etudiant1 = new Etudiant(10001, "Jeant Marc", 75) ;
		Etudiant etudiant2 = new Etudiant(10002, "Christine ", 85) ;
		Etudiant etudiant3 = new Etudiant(10003, "Dupont Dupond", 70) ;
		
		//********************* INSTANCIATION DES PROFS *************************
		
		Professeur prof1 = new Professeur(35001, "Alexendre", 78);
		Professeur prof2 = new Professeur(35002, "Alexendre", 90);
		Professeur prof3 = new Professeur(35003, "Alexendre", 83);
		
		//********************* INSTANCIATION DU PERSONNELS ADMIN **************
		
		
		Administratif admin1 = new Administratif("code d'accés 66001", "Jean Dupont", 90);
		Administratif admin2 = new Administratif("code d'accés 66002", "Jean Batiste", 90);
		Administratif admin3 = new Administratif("code d'accés 66003", "Alex premier", 90);
		
		System.out.println("********************* Affichage etudiant *********************\n");
		
		etudiant1.afficher();
		etudiant2.afficher();
		etudiant3.afficher();

		System.out.println("********************* Affichage profs *********************\n");
		
		prof1.afficher();
		prof2.afficher();
		prof3.afficher();
		
		System.out.println("********************* Affichage Admin *********************\n");
		
		admin1.afficher();
		admin2.afficher();
		admin3.afficher();
		
		arrayPersonne.add(etudiant1);
		arrayPersonne.add(etudiant2);
		
		AscenseurRouge ascRouge = new AscenseurRouge("ref: 001", "Ascenseur rouge", 5, 100, 200, arrayPersonne) ;
		
		ascRouge.Afficher();
		
		ascRouge.monter();
	
	
	}	

}
