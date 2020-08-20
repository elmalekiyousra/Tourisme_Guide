package com.guide.TourismGuid.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Hotels")

public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prix")
	private Double prix ;
	@Column(name = "proximite")
	private String proximite;
	@Column(name = "nbChambreVide")
	private int nbChambreVide;
	@Column(name = "numReception")
	private Long numReception;
	@Column(name = "position")
	private String position;
	@Column(name = "siteOfficiel")
	private String siteOfficiel;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "admin_id")
	private Admin admin;

	public Hotel() {
		super();
	}

	public Hotel(String nom, Double prix, String proximite, int nbChambreVide, Long numReception, String position,
			String siteOfficiel) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.proximite = proximite;
		this.nbChambreVide = nbChambreVide;
		this.numReception = numReception;
		this.position = position;
		this.siteOfficiel = siteOfficiel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String getProximite() {
		return proximite;
	}

	public void setProximite(String proximite) {
		this.proximite = proximite;
	}

	public int getNbChambreVide() {
		return nbChambreVide;
	}

	public void setNbChambreVide(int nbChambreVide) {
		this.nbChambreVide = nbChambreVide;
	}

	public Long getNumReception() {
		return numReception;
	}

	public void setNumReception(Long numReception) {
		this.numReception = numReception;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSiteOfficiel() {
		return siteOfficiel;
	}

	public void setSiteOfficiel(String siteOfficiel) {
		this.siteOfficiel = siteOfficiel;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	

	

}
