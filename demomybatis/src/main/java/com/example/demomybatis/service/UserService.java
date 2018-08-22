package com.example.demomybatis.service;


import com.example.demomybatis.domain.User;

public interface UserService {

	public int add(User user);
	
	
	
	/**
	 * 功能描述：测试事务
	 * @return
	 */
	public int addAccount();
	
}
