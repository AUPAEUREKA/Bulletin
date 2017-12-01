package com.ecetech.titi3.itprojet.Ecole.model.beans;

public class Authentification {

	private int type;
	private String login;
	private String password;
	
	
	public Authentification(int type, String login, String password) {
		this.type = type;
		this.login = login;
		this.password = password;
	}
	
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
