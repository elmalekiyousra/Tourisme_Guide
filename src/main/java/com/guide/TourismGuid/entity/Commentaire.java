package com.guide.TourismGuid.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Commentaires")
public class Commentaire {
	public int id;
	public String commentaire;

}
