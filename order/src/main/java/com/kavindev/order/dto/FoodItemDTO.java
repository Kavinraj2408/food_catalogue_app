package com.kavindev.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class FoodItemDTO {

    private int id;
	
	private String itemName;
	
	private String itsDescription;
	
	private boolean isVeg;
	
	private Integer price;
	
	private Integer restaurantId;
	
	private Integer quantity;

	public FoodItemDTO(int id, String itemName, String itsDescription, boolean isVeg, Integer price,
			Integer restaurantId, Integer quantity) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itsDescription = itsDescription;
		this.isVeg = isVeg;
		this.price = price;
		this.restaurantId = restaurantId;
		this.quantity = quantity;
	}

	public FoodItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItsDescription() {
		return itsDescription;
	}

	public void setItsDescription(String itsDescription) {
		this.itsDescription = itsDescription;
	}

	public boolean isVeg() {
		return isVeg;
	}

	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
