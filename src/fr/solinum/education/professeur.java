package fr.solinum.education;

import java.util.ArrayList;

import fr.solinum.parcours.*;

public class professeur {

	//declaration des attributs
	
	private int id_professeur;
	private String nom_professeur;
	private String prenom_professeur;
	private ArrayList<etudiant> listeEtudiant;
	private ArrayList<cour>	listCours;
	//constructeur
	public professeur(int idP,String nP,String pP, ArrayList<etudiant> le,ArrayList<cour> lc) {
		this.id_professeur	=	idP;
		this.nom_professeur	=	nP;
		this.prenom_professeur	= pP;
		this.listeEtudiant	=	le;
		this.listCours	=	lc;
	}
	//declaration des methodes
	
	public int getId_professeur() {
		return id_professeur;
	}
	public void setId_professeur(int id_professeur) {
		this.id_professeur = id_professeur;
	}
	public String getNom_professeur() {
		return nom_professeur;
	}
	public void setNom_professeur(String nom_professeur) {
		this.nom_professeur = nom_professeur;
	}
	public String getPrenom_professeur() {
		return prenom_professeur;
	}
	public void setPrenom_professeur(String prenom_professeur) {
		this.prenom_professeur = prenom_professeur;
	}
	public ArrayList<etudiant> getEtudiants(){
		return listeEtudiant;
	}
	public void setEtudiant(ArrayList<etudiant> e) {
		for(int i	=	0	;	i	<	e.size()	;	i++) {
			this.listeEtudiant	=	e;
		}
	}
	public void setCour(ArrayList<cour> c) {
		for(int i	=	0	;	i	<	c.size()	;	i++) {
			this.listCours	=	c;
		}
	}
	public ArrayList<cour> getCours(){
		return listCours;
	}
}
