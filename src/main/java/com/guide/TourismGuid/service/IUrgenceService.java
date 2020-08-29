package com.guide.TourismGuid.service;

import java.util.List;

import com.guide.TourismGuid.entity.Urgence;

public interface IUrgenceService {

	public void addUrgence(Urgence urgence);
	public void deleteUrgence(int id);
	public void updateUrgence(int id);
	public List<Urgence>getAllUrgence();
}
