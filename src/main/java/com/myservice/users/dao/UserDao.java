package com.myservice.users.dao;

import com.myservice.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}