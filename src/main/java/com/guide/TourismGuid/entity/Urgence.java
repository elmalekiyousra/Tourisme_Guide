package com.guide.TourismGuid.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="Urgences")

public class Urgence {
	public int id;
	public String nom;
	public Double prix  ;
	public String proximite;
	public int nbChambreVide;
	public Long numReception;
	public String position;
	public String siteOfficiel;

	

}
