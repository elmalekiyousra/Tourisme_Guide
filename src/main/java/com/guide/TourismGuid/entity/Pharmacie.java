package com.guide.TourismGuid.entity;

import java.sql.Date;

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
@Table(name="Pharmacies")
public class Pharmacie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "adresse")
	private String adresse;
	@Column(name = "localisation")
	private String localisation;
	@Column(name = "dateTravail")
	private Date dateTravail;
	@Column(name = "enGarde")
	private Boolean enGarde;
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "admin_id")
	private Admin admin;
	public Pharmacie() {
		super();
	}
	public Pharmacie(String nom, String adresse, String localisation, Date dateTravail, Boolean enGarde) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.localisation = localisation;
		this.dateTravail = dateTravail;
		this.enGarde = enGarde;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public Date getDateTravail() {
		return dateTravail;
	}
	public void setDateTravail(Date dateTravail) {
		this.dateTravail = dateTravail;
	}
	public Boolean getEnGarde() {
		return enGarde;
	}
	public void setEnGarde(Boolean enGarde) {
		this.enGarde = enGarde;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	

}
