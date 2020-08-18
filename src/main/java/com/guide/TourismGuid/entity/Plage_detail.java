package com.guide.TourismGuid.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Plage_datails")
public class Plage_detail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name="imageUrl")
	public String imageUrl;
	@Column(name="localisation")
	public String localisation;
	
	
	public Plage_detail() {
		super();
	}
	
	public Plage_detail(String imageUrl, String localisation) {
		super();
		this.imageUrl = imageUrl;
		this.localisation = localisation;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	@Override
	public String toString() {
		return "Plage_detail [id=" + id + ", imageUrl=" + imageUrl + ", localisation=" + localisation + "]";
	}
	
	

}
