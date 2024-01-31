package com.kavindev.FoodCatalogueListing.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.kavindev.FoodCatalogueListing.dto.FoodItemDTO;
import com.kavindev.FoodCatalogueListing.entity.FoodItem;

@Mapper(uses = BooleanMapper.class)
public interface FoodItemMapper {
    
    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);
    
    @Mapping(target = "isVeg", source = "isVeg", qualifiedByName = "booleanToString") 
    FoodItem mapFoodItemDTOToFoodItem(FoodItemDTO dto);
    
    @Mapping(target = "isVeg", source = "isVeg", qualifiedByName = "stringToBoolean") 
    FoodItemDTO mapFoodItemToFoodItemDTO(FoodItem food);
}
