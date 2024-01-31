package com.kavindev.restaurantListing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kavindev.restaurantListing.dto.RestaurantDTO;
import com.kavindev.restaurantListing.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	RestaurantService service;

	@GetMapping("/fetchAllRestaurants")
	public ResponseEntity<List<RestaurantDTO>> fetchAllRestaurants(){
		List<RestaurantDTO> listOfRestaurants = service.findAllRestaurants();
		return new ResponseEntity<>(listOfRestaurants, HttpStatus.OK);
		
	}
	
	@GetMapping("/getRestaurant/id/{id}")
	public ResponseEntity<RestaurantDTO> getRestaurant(@PathVariable int id) {
		 return service.getRestaurantById(id);
//		return new ResponseEntity<RestaurantDTO>(dto, HttpStatus.OK);
		
	}
	
	@PostMapping("/addRestaurant")
	public ResponseEntity<RestaurantDTO> addRestaurant(@RequestBody RestaurantDTO dto) {
		RestaurantDTO added = service.addRestaurant(dto);
		return new ResponseEntity<>(added,HttpStatus.CREATED);
	}
}
