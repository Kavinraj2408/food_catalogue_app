package com.kavindev.order.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.kavindev.order.dto.OrderDTO;
import com.kavindev.order.entity.Order;

@Mapper
public interface OrderMapper {
	
	OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
	
	Order mapOrderDTOToOrder(OrderDTO dto);
	OrderDTO mapOrderToOrderDTO(Order order);

}
