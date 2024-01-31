package com.kavindev.FoodCatalogueListing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kavindev.FoodCatalogueListing.repo.FoodItemRepo;

@Service
public class FoodCatalogueService {
	
	@Autowired
	FoodItemRepo repo;

}
