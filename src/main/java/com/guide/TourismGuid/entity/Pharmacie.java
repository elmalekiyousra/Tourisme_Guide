package com.guide.TourismGuid.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Pharmacies")
public class Pharmacie {
	public int id;
	public String nom;
	public String adresse;
	public String localisation;
	public Date dateTravail;
	public Boolean enGarde;

}
