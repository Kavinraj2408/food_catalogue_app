package com.kavindev.FoodCatalogueListing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItemDTO {
	
    private int id;
	
	private String itemName;
	
	private String itsDescription;
	
	private boolean isVeg;
	
	private Integer price;
	
	private Integer restaurantId;
	
	private Integer quantity;

}
