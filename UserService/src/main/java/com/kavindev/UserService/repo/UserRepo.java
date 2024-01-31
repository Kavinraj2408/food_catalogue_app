package com.kavindev.UserService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kavindev.UserService.entity.UserInfo;

@Repository
public interface UserRepo extends JpaRepository<UserInfo, Integer>{

}
