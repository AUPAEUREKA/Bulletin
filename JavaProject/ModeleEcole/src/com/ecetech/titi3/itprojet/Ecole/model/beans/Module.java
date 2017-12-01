package com.ecetech.titi3.itprojet.Ecole.model.beans;

public class Module {
	
	private String type;
	private String nom;
	
	
	public Module(String type, String nom) {
		this.type = type;
		this.nom = nom;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
