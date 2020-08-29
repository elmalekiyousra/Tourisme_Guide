package com.guide.TourismGuid.service;

import java.util.List;

import com.guide.TourismGuid.entity.Pharmacie;



public interface IPharmacieService {

	public void addPharmacie(Pharmacie pharmacie);
	public void deletePharmacie(int id);
	public void updatePharmacie(int id);
	public List<Pharmacie> getAllPharmacie();
}
