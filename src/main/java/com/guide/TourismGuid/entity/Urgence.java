package com.guide.TourismGuid.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Urgences")
public class Urgence {
	@Id
	public long id;
	public String localisation;
	public Boolean ambulanceDispo;

}
