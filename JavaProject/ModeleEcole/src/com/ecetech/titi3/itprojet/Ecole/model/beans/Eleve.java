package com.ecetech.titi3.itprojet.Ecole.model.beans;

public class Eleve {
	
	private String nom;
	private String prenom;
	private int numeroCarte;
	private int nombreAbsence;
	
	public Eleve(String nom, String prenom, int numeroCarte, int nombreAbsence) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroCarte = numeroCarte;
		this.nombreAbsence = nombreAbsence;
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
	public int getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	public int getNombreAbsence() {
		return nombreAbsence;
	}
	public void setNombreAbsence(int nombreAbsence) {
		this.nombreAbsence = nombreAbsence;
	}

}
