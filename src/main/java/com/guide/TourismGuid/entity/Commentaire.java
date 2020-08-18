package com.guide.TourismGuid.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Commentaires")
public class Commentaire {
	@Id
	public long id;
	public String commentaire;

}
