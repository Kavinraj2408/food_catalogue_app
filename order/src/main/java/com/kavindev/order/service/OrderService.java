package com.kavindev.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kavindev.order.dto.OrderDTO;
import com.kavindev.order.dto.OrderDTOFromFE;
import com.kavindev.order.dto.UserDTO;
import com.kavindev.order.entity.Order;
import com.kavindev.order.mapper.OrderMapper;
import com.kavindev.order.repo.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	OrderRepo repo;
	
	@Autowired
	SequenceGenerator gen;
	
	@Autowired
	RestTemplate restTemplate;

	public OrderDTO saveOrderInDb(OrderDTOFromFE orderDetails) {
		// TODO Auto-generated method stub
		Integer newOrderId = gen.generateNextOrderId() ;
		
		UserDTO dto = fetchUserDetailsById(orderDetails.getUserId());
		Order order = new Order(newOrderId,orderDetails.getFoodItemList(),dto,orderDetails.getRes());
		repo.save(order);
		return OrderMapper.INSTANCE.mapOrderToOrderDTO(order);
	}

	private UserDTO fetchUserDetailsById(Integer userId) {
		return restTemplate.getForObject("http://USER-SERVICE/userService/id/"+userId, UserDTO.class);
	}

}
