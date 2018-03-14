package fr.solinum.parcours;

import java.util.ArrayList;

public class etudiant {

	// attributs
	private int matricule;
	private String nom;
	private String prenom;
	private String classe;
	private ArrayList<cour> listecour;
	
	//constructeur
	public etudiant(int m,String ne,String pe, String ce, ArrayList<cour> lc) {
		this.matricule	=	m;
		this.nom	=	ne;
		this.prenom	=	pe;
		this.classe	=	ce;
		this.listecour	= lc;
	}
	//Methodes
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public ArrayList<cour> getCourEtudiants(){
		return listecour;
	}
	public void setCourEtudiants(ArrayList<cour> ce) {
		for(int		i	=	0	;	i	<	ce.size()	;	i++) {
			this.listecour	=	ce;
		}
	}
	
	
}
