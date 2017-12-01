package com.ecetech.titi3.itprojet.Ecole.model.beans;

public class Note {

	private int id;
	private float note;
	private int coef;
	
	public Note(int id, float note, int coef) {
		this.id = id;
		this.note = note;
		this.coef = coef;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public int getCoef() {
		return coef;
	}
	public void setCoef(int coef) {
		this.coef = coef;
	}
	
}
