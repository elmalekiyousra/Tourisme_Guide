package com.guide.TourismGuid.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Restaurants")
public class Restaurant {
	public int id;
	public String nom;
	public Double numtel;
	public String adresse;
	public Boolean estOuvert;
	public String localisation;
	public String site;
	public String menu;
}
