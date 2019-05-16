package com.cgi.api.facile;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Utilisateur {
	
	private String nom;
	private int age;
	private boolean vivant;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVivant() {
		return vivant;
	}
	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}
}
