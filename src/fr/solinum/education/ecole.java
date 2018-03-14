package fr.solinum.education;

import java.util.ArrayList;
import fr.solinum.parcours.etudiant;

public class ecole {

	//declaration des attributs
	private String nom_ecole;
	private String adresse_ecole;
	private ArrayList<professeur> professeurs;
	private ArrayList<etudiant> etudiants;
	//constructeur
	public ecole(String nE, String aE,ArrayList<professeur> pr,ArrayList<etudiant> et) {
		this.nom_ecole	=	nE;
		this.adresse_ecole	=	aE;
		this.professeurs	=	pr;
		this.etudiants	=	et;
	}
	//declaration des methodes
	
	public String getNom_ecole() {
		return nom_ecole;
	}
	public void setNom_ecole(String nom_ecole) {
		this.nom_ecole = nom_ecole;
	}
	public String getAdresse_ecole() {
		return adresse_ecole;
	}
	public void setAdresse_ecole(String adresse_ecole) {
		this.adresse_ecole = adresse_ecole;
	}
	public ArrayList<professeur>	getProfesseurs(){
		return professeurs;
	}
	public void setProfesseurs(ArrayList<professeur> p) {
		for(int	 i	=	0	;	i	<	p.size()	;	i++) {
			this.professeurs	=	p;
		}
	}
	public void setEtudiants(ArrayList<etudiant> e) {
		for(int	i	=	0	;	i	<	e.size()	;	i++) {
			this.etudiants	=	e;
		}
	}	
	public ArrayList<etudiant>	getEtudiants(){
		return etudiants;
	}
}
