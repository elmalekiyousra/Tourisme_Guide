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
@Table(name="Restaurants")
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	@Column(name = "nom")
	public String nom;
	@Column(name = "numtel")
	public Double numtel;
	@Column(name = "adresse")
	public String adresse;
	@Column(name = "estOuvert")
	public Boolean estOuvert;
	@Column(name = "localisation")
	public String localisation;
	@Column(name = "site")
	public String site;
	@Column(name = "menu")
	public String menu;
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "admin_id")
	private Admin admin;
	
	public Restaurant() {
		super();
	}

	public Restaurant(String nom, Double numtel, String adresse, Boolean estOuvert, String localisation, String site,
			String menu) {
		super();
		this.nom = nom;
		this.numtel = numtel;
		this.adresse = adresse;
		this.estOuvert = estOuvert;
		this.localisation = localisation;
		this.site = site;
		this.menu = menu;
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

	public Double getNumtel() {
		return numtel;
	}

	public void setNumtel(Double numtel) {
		this.numtel = numtel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Boolean getEstOuvert() {
		return estOuvert;
	}

	public void setEstOuvert(Boolean estOuvert) {
		this.estOuvert = estOuvert;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
}
