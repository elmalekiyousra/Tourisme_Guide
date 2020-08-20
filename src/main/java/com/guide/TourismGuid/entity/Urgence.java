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
@Table(name="Urgences")
public class Urgence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	@Column(name = "localisation")
	public String localisation;
	@Column(name = "ambulanceDispo")
	public Boolean ambulanceDispo;
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "admin_id")
	private Admin admin;
	public Urgence() {
		super();
	}
	public Urgence(String localisation, Boolean ambulanceDispo) {
		super();
		this.localisation = localisation;
		this.ambulanceDispo = ambulanceDispo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public Boolean getAmbulanceDispo() {
		return ambulanceDispo;
	}
	public void setAmbulanceDispo(Boolean ambulanceDispo) {
		this.ambulanceDispo = ambulanceDispo;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	

}
