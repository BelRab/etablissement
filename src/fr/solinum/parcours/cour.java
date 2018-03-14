package fr.solinum.parcours;

public class cour {
	
	//declaration des attributs
	
	private int id_cour;
	private String nom_cour;
	private String description;
	
	//constructeur
	public cour	(int idCour,	String nomCour,		String descriptionCour){
		this.id_cour	=	idCour;
		this.nom_cour	=	nomCour;
		this.description	=	descriptionCour;
	}
	//declaration des methodes
	
	public int getId_cour() {
		return id_cour;
	}
	public void setId_cour(int id_cour) {
		this.id_cour = id_cour;
	}
	
	public String getNom_cour() {
		return nom_cour;
	}
	public void setNom_cour(String nom_cour) {
		this.nom_cour = nom_cour;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
