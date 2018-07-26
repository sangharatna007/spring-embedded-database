package com.mkyong.dao;

import java.util.List;

import com.mkyong.model.User;

public interface UserDao {

	User findByName(String name);
	User findById(Integer id);
	
	List<User> findAll();

}