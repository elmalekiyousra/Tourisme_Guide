package com.guide.TourismGuid.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Urgences")
public class Urgence {
	
	public int id;
	public String localisation;
	public Boolean ambulanceDispo;

}
