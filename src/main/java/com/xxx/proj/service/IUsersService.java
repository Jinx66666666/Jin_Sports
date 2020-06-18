package com.xxx.proj.service;

import java.util.List;
import java.util.Map;

import com.xxx.proj.entity.Result;
import com.xxx.proj.entity.UserPeople;
import com.xxx.proj.query.UserQuery;

public interface IUsersService {
	
	/**
	 * 分页+搜索  用户信息
	 * @param query
	 * @return
	 */
	Map getUsers(UserQuery query);

	
	
	/**
	 * 添加用户信息
	 * @param e
	 * @return
	 */
	Result addUser(UserPeople e);

	/**
	 * 修改用户信息
	 * @param e
	 * @return
	 */
	Result editUser(UserPeople e);
	/**
	 * 根据该行id查询用户信息
	 * @param id
	 * @return
	 */
	UserPeople getUserByID(int id);

	/**
	 * 根据id批量删除信息
	 * @param ids
	 * @return
	 */
	Result deleteUsers(int[] ids);
	


	



	



	

	





}
