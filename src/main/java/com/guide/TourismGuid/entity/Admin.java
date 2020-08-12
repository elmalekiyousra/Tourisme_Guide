package com.guide.TourismGuid.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Admins")
public class Admin {
	
	public int id;
	public String nomUtilisateur;
	public String motdePasse;

}
