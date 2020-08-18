package com.guide.TourismGuid.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Admins")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name="nomUtilisateur")
	private String nomUtilisateur;
	@Column(name="motdePasse")
	private String motdePasse;
	@OneToMany(mappedBy = "admin",
			cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	//@JoinColumn(name="id", referencedColumnName = "id")
	private List<Plage> plages;
	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id", referencedColumnName = "id")
	private List<Hotel> hotels = new ArrayList<Hotel>();
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id", referencedColumnName = "id")
	private List<Pharmacie> pharmacies = new ArrayList<Pharmacie>();
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id", referencedColumnName = "id")
	private List<Restaurant> restaurants = new ArrayList<Restaurant>();
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id", referencedColumnName = "id")
	private List<Urgence> urgences = new ArrayList<Urgence>();*/
	
	public Admin() {
		super();
	}

	public Admin(String nomUtilisateur, String motdePasse) {
		super();
	
		this.nomUtilisateur = nomUtilisateur;
		this.motdePasse = motdePasse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMotdePasse() {
		return motdePasse;
	}

	public void setMotdePasse(String motdePasse) {
		this.motdePasse = motdePasse;
	}
	
	public List<Plage> getPlages() {
		return plages;
	}

	public void setPlages(List<Plage> plages) {
		this.plages = plages;
	}

	@Override
	public String toString() {
		return "Admin [nomUtilisateur=" + nomUtilisateur + ", motdePasse=" + motdePasse + "]";
	}

	/*public List<Plage> getPlages() {
		return plages;
	}

	public void setPlages(List<Plage> plages) {
		this.plages = plages;
	}*/

	/*public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	public List<Pharmacie> getPharmacies() {
		return pharmacies;
	}

	public void setPharmacies(List<Pharmacie> pharmacies) {
		this.pharmacies = pharmacies;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public List<Urgence> getUrgences() {
		return urgences;
	}

	public void setUrgences(List<Urgence> urgences) {
		this.urgences = urgences;
	}*/

	

}
