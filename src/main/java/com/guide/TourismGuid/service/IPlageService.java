package com.guide.TourismGuid.service;

import java.util.List;

import com.guide.TourismGuid.entity.Plage;

public interface IPlageService {
	public void addPlgae(Plage plage);
	public void deletePlage(int id);
	public void updtaePlage(int id);
	public List<Plage> getAllPlage();

}
