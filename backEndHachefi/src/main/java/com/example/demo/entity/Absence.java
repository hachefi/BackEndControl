package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Absence")
public class Absence {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String seance;
	private String date;
	private String heure;
	private String motif;

	@ManyToOne
	private Etudiant etudiant;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSeance() {
		return seance;
	}

	public void setSeance(String seance) {
		this.seance = seance;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public Absence(Integer id, String seance, String date, String heure, String motif, Etudiant etudiant) {
		super();
		this.id = id;
		this.seance = seance;
		this.date = date;
		this.heure = heure;
		this.motif = motif;
		this.etudiant = etudiant;
	}

	public Absence() {}

	@Override
	public String toString() {
		return "Absence [id=" + id + ", seance=" + seance + ", date=" + date + ", heure=" + heure + ", motif=" + motif
				+ ", etudiant=" + etudiant + "]";
	}
	
	
	

}
