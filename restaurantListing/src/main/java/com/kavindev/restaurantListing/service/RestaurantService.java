package com.kavindev.restaurantListing.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kavindev.restaurantListing.dto.RestaurantDTO;
import com.kavindev.restaurantListing.entity.Restaurant;
import com.kavindev.restaurantListing.mapper.RestaurantMapper;
import com.kavindev.restaurantListing.repo.RestaurantRepo;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepo repo;

	public List<RestaurantDTO> findAllRestaurants() {
		// TODO Auto-generated method stub
	    List<Restaurant> rest = repo.findAll();
	    List<RestaurantDTO> list = rest.stream().map(restaurant -> RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant)).collect(Collectors.toList());
	    return list;
	}

	public RestaurantDTO addRestaurant(RestaurantDTO dto) {
		// TODO Auto-generated method stub
		Restaurant res = repo.save(RestaurantMapper.INSTANCE.mapRestaurantDTOToRestaurant(dto));
		return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(res);
	}

	public ResponseEntity<RestaurantDTO> getRestaurantById(int id) {
		Optional<Restaurant> restaurant = repo.findById(id);
		if(restaurant.isPresent()) {
			return new ResponseEntity<>(RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant.get()),HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
}
