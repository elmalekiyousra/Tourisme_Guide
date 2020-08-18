package com.guide.TourismGuid.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;



@Entity
@Table(name="Plages")
public class Plage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name="nom")
	public String nom;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "plage_detail_id")
	public Plage_detail plageDetail; 
	
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "admin_id")
	public Admin admin;
	
	public Plage() {
		super();
	}
	public Plage(String nom) {
		super();
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Plage_detail getPlageDetail() {
		return plageDetail;
	}
	public void setPlageDetail(Plage_detail plageDetail) {
		this.plageDetail = plageDetail;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	
	

}
