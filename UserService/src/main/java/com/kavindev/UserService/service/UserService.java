package com.kavindev.UserService.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kavindev.UserService.dto.UserInfoDTO;
import com.kavindev.UserService.entity.UserInfo;
import com.kavindev.UserService.mapper.UserMapper;
import com.kavindev.UserService.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;


	public UserInfoDTO addUser(UserInfoDTO dto) {
		// TODO Auto-generated method stub
		UserInfo info = repo.save(UserMapper.INSTANCE.mapUserInfoDTOToUserInfo(dto));
		return UserMapper.INSTANCE.mapUserInfoToUserInfoDTO(info);
	}


	public List<UserInfoDTO> getAllUsers() {
		List<UserInfo> list = repo.findAll();
		List<UserInfoDTO> dto = list.stream().map(t -> UserMapper.INSTANCE.mapUserInfoToUserInfoDTO(t)).collect(Collectors.toList());
		return dto;
	}


	public ResponseEntity<UserInfoDTO> findById(int id) {
		// TODO Auto-generated method stub
		Optional<UserInfo> user = repo.findById(id);
		if(user.isPresent()) {
			return new ResponseEntity<>(UserMapper.INSTANCE.mapUserInfoToUserInfoDTO(user.get()),HttpStatus.OK);
		}
		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
}
