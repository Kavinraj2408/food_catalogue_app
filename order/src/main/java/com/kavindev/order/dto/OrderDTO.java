package com.kavindev.order.dto;

import java.util.List;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class OrderDTO {
	
    private Integer orderId;
	
    private List<FoodItemDTO> foodItemList;
	
	private UserDTO userDto;
	
	private RestaurantDTO res;

	public OrderDTO(Integer orderId, List<FoodItemDTO> foodItemList, UserDTO userDto, RestaurantDTO res) {
		super();
		this.orderId = orderId;
		this.foodItemList = foodItemList;
		this.userDto = userDto;
		this.res = res;
	}

	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public List<FoodItemDTO> getFoodItemList() {
		return foodItemList;
	}

	public void setFoodItemList(List<FoodItemDTO> foodItemList) {
		this.foodItemList = foodItemList;
	}

	public UserDTO getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}

	public RestaurantDTO getRes() {
		return res;
	}

	public void setRes(RestaurantDTO res) {
		this.res = res;
	}

	
}
