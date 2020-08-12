package com.guide.TourismGuid.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Plages")
public class Plage {
	public int id;
	public String nom;
	public String imageUrl;
	public String localisation;

}
