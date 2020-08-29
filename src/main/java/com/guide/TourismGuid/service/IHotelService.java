package com.guide.TourismGuid.service;

import java.util.List;

import com.guide.TourismGuid.entity.Hotel;


public interface IHotelService {
	public void addHotel(Hotel hotel);
	public void deleteHotel(int id);
	public void updateHotel(int id);
	public List<Hotel> getAllHotel();

}
