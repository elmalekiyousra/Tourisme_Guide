package com.guide.TourismGuid.service;

import java.util.List;

import com.guide.TourismGuid.entity.Restaurant;


public interface IRestaurantService {
	public void addRestaurant(Restaurant restaurant);
	public void deleteRestaurant(int id);
	public void updateRestaurant(int id);
	public List<Restaurant>getAllRestaurant();

}
