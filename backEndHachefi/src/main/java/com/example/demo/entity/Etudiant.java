package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Etudiant")
public class Etudiant {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nom;
	private String prenom;
	private String email;
	private String niveau;
	private String filliere;
	
	@OneToMany
	private List<Absence>absences;
	public Etudiant() {
		
	}
	public Etudiant(Integer id, String nom, String prenom, String email, String niveau, String filliere,
			List<Absence> absences) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.niveau = niveau;
		this.filliere = filliere;
		this.absences = absences;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getFilliere() {
		return filliere;
	}
	public void setFilliere(String filliere) {
		this.filliere = filliere;
	}
	public List<Absence> getAbsences() {
		return absences;
	}
	public void setAbsences(List<Absence> absences) {
		this.absences = absences;
	}
	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", niveau=" + niveau
				+ ", filliere=" + filliere + ", absences=" + absences + "]";
	}
	
}
