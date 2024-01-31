package com.kavindev.order.dto;

import java.util.List;

public class OrderDTOFromFE {

	private List<FoodItemDTO> foodItemList;
	
	private Integer userId;
	
	private RestaurantDTO res;

	public OrderDTOFromFE(List<FoodItemDTO> foodItemList, Integer userId, RestaurantDTO res) {
		super();
		this.foodItemList = foodItemList;
		this.userId = userId;
		this.res = res;
	}

	public OrderDTOFromFE() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<FoodItemDTO> getFoodItemList() {
		return foodItemList;
	}

	public void setFoodItemList(List<FoodItemDTO> foodItemList) {
		this.foodItemList = foodItemList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public RestaurantDTO getRes() {
		return res;
	}

	public void setRes(RestaurantDTO res) {
		this.res = res;
	}
	
	
}
