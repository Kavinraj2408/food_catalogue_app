package com.kavindev.restaurantListing.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.kavindev.restaurantListing.dto.RestaurantDTO;
import com.kavindev.restaurantListing.entity.Restaurant;

@Mapper
public interface RestaurantMapper { // this class is used to map between entity and dto classes
	
	RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);
	
	Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO dto);
	RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
