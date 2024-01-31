package com.kavindev.FoodCatalogueListing.dto;

import java.util.List;

import com.kavindev.FoodCatalogueListing.entity.FoodItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodCataloguePage {
	
	private List<FoodItem> fooItemList;

	private RestaurantDTO restaurant;
}
