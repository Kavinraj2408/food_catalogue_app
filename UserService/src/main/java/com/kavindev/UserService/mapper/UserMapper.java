package com.kavindev.UserService.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.kavindev.UserService.dto.UserInfoDTO;
import com.kavindev.UserService.entity.UserInfo;

@Mapper
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	UserInfo mapUserInfoDTOToUserInfo(UserInfoDTO dto);
	UserInfoDTO mapUserInfoToUserInfoDTO(UserInfo user);
}
