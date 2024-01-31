package com.kavindev.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kavindev.UserService.dto.UserInfoDTO;
import com.kavindev.UserService.service.UserService;

@RestController
@RequestMapping("/userService")
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/addUser")
	public ResponseEntity<UserInfoDTO> saveUser(@RequestBody UserInfoDTO dto){
		UserInfoDTO userDto = service.addUser(dto);
		return new ResponseEntity<>(userDto,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/fetchAllUsers")
	public ResponseEntity<List<UserInfoDTO>> getAllUsers(){
		List<UserInfoDTO> list = service.getAllUsers();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<UserInfoDTO> findById(@PathVariable int id){
		ResponseEntity<UserInfoDTO> dto = service.findById(id);
		return dto;
	}
}
